QEmu API for Java
=================

Motivation
----------

This project serves two major purposes in integrating QEmu control
with the JVM.

* Unit Testing
* Virtual Machine Management

Unit Testing
------------

It's all about development speed, and development speed is so much
about test speed, and this package is a key part of the solution to
test speed.

A primary limiting factor on development speed is the elapsed time
between writing code and obtaining test results. If the project being
developed requires a full Unix environment, it is common to have to
wait for an overnight Jenkins build, which can take hours, and is
managed by a pile of ad-hoc shell scripts - yes, I know you've done
it because I've done it. We've all done it.

In addition, such ad-hoc shell scripts make it impossible to
comprehensively test failure modes: disk, CPU, network, rack,
port, since they cannot control the emulated environment in a fine
grained manner. This package allows the automation of the assembly
and manipulation of complex network topologies, control of the full
lifecycle of the application and underlying VM, and the programmatic
introduction of any fault which can be emulated by QEmu or Linux.

By integrating QEmu and QApi with JUnit and Java, it is also
integrated with Jenkins, Gradle, and the rest of the standard
enterprise testing and reporting stack. When combined with
[http://github.com/shevek/imagebuilder](imagebuilder), this package
also permits developers to test reliably on their own laptop what
would previously have required corporate infrastructure, further
accelerating the development cycle.

[http://github.com/nebula-plugins/nebula-ospackage-plugin](nebula-ospackage-plugin)
is also very useful for making single-button gradle builds which
assemble and test software.

Structure of the Project
------------------------

This package consists of three major modules for manipulating and
managing QEmu virtual machines from Java. They are:

* [qemu-exec](#executing-qemu-qemu-exec): Command line execution.
* [qemu-qapi](#manipulating-qemu-qemu-qapi): Interface to running VMs.
* [qemu-manager](#managing-qemu-processes-qemu-manager): Manager and registry of running VMs.

Executing QEmu (qemu-exec)
--------------------------

This module allows the user to build a QEmu command line and start
a subprocess.  Both raw command line options and common recipes for
interdependent option-sets are provided.  The objective is to provide
an assurance of a correct command line using Java type safety and
these builtin recipes.

	QEmuIdAllocator allocator = new QEmuIdAllocator();
	QEmuCommandLine commandLine = new QEmuCommandLine(QEmuArchitecture.x86_64);
	commandLine.addOptions(
		new QEmuMemoryOption(1, QEmuMemoryOption.Magnitude.GIGA),
		new QEmuCpusOption(2).withSockets(2).withCores(1).withThreads(1),
		new QEmuVirtioDriveRecipe(allocator, "/var/tmp/qemu/sys-1/vda").withFormat(Format.raw).withCache(Cache.unsafe),
		new QEmuVirtioNetRecipe(allocator).withMac("08:00:20:c0:ff:ee")
	);
	Process process = commandLine.exec();

Some options are deprecated or historic; we have preferred the
more modern variants of options in all cases. Here is a partial
translation table:

* -hda -> new QEmuVirtioDriveRecipe() (or new QEmuDeviceOption())
* -enable-kvm -> new QEmuMachineOption().withAcceleration(Acceleration.kvm, Acceleration.tcg)
* -net nic/-net tap -> new QEmuVirtioNetRecipe() (or new QEmuNetdevOption())

Manipulating QEmu (qemu-qapi)
-----------------------------

QApi is a JSON-based remote control protocol for a running QEmu
process. The protocol is defined in a file called qemu-schema.json
in the qemu 1.7 or later source trees.  This package generates a set
of Java API classes from the JSON schema, so that a Java-based client
can use QApi directly.

    QApiConnection connection = new QApiConnection(...);
    CpuInfo info = connection.call(new QueryCpusCommand());

It is the job of the user to provide an appropriate InetSocketAddress
for the QApiConnection. Or you could use qemu-manager:

*Important note:* The generated sources use the Optional type from
Java 8. This means that consumers of this library must:

1. Use Java 8.
2. Ensure that Jackson is configured correctly. There are two options,
   per the documentation at:
   https://github.com/FasterXML/jackson-modules-java8
   1. 1. Jackson 3.x requires Java 8 to work and thereby supports
      Optional as we require. However, it is not released as of April
      2018.
   2. Jackson 2.x requires the Java 8 Datatypes module to support
      Optional correctly. Add a dependency on `jackson-datatype-jdk8`
      and minimally configure the `ObjectMapper` per the instructions
      at the link above.

Managing QEmu Processes (qemu-manager)
--------------------------------------

[QEmuManager.java](qemu-manager/src/main/java/org/anarres/qemu/manager/QEmuManager.java)
will execute a QEmuCommandLine, construct a QApiConnection to the
newly created virtual machine, and return it to the user.

	QEmuManager manager = new QEmuManager();
	...
	QEmuCommandLine commandLine = ...
	QEmuProcess process = manager.execute(commandLine);
	QApiConnection connection = process.getConnection();
	connection.call(...);

API Documentation
-----------------

The [JavaDoc is available](http://shevek.github.io/qemu-java/docs/javadoc/).

Building
--------

This is a standard gradle build: Run

    ./gradlew build

If QEmu updates its protocol, you can regenerate the sources from
the original JSON schema:

    ./gradlew generate build

By default, this will fetch the JSON schema from the master branch
of qemu's github. To specify an alternate location, add:

    args = [ "--input", "<file|http[s]>://...." ]

to the generate task in build.gradle. See
[generator/Main.java](qemu-qapi/src/generate/java/org/anarres/qemu/qapi/generator/Main.java)
for more details.

