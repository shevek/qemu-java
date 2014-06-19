QEmu QApi for Java
==================

QApi is a JSON-based remote control protocol for QEmu. The protocol
is defined in a file called qemu-schema.json in the qemu 1.7 or later
source trees.
This package generates a set of Java API classes from the JSON schema,
so that a Java-based client can use QApi directly.

The serializer is based on Google's GSON library.

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
[src/generate/java/org/anarres/qemu/qapi/generator/Main.java] for
more details.

Using
-----

Currently, you are responsible for making your own TCP connection to
your QEmu process. After that, you can:
	Gson gson = new GsonBuilder().create();
	String message = gson.toJson(apiObject);

