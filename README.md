QEmu QApi for Java
==================

QApi is a JSON-based remote control protocol for QEmu. The protocol
is defined in a file called qemu-schema.json in the qemu 1.7 or later
source trees.
This package generates a set of Java API classes from the JSON schema,
so that a Java-based client can use QApi directly.

The serializer is based on Google's GSON library.

API Documentation
-----------------

The API is derived directly from the QEmu specification, and the
[JavaDoc is available](http://shevek.github.io/qemu-java/docs/javadoc/).

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
[generator/Main.java](src/generate/java/org/anarres/qemu/qapi/generator/Main.java) for
more details.

Using
-----

    QApiConnection connection = new QApiConnection(...);
    CpuInfo info = connection.invoke(new QueryCpusCommand());

