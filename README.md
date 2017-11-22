# Java JUnit Sample Repository

## Overview

This repository is to demonstrate how to use JUnit, and how to use Apache Ant and JRuby to compile and run the class files or JAR file. This repository doesn't do much more than print `Hello World!` to the command line, but the Java code shows some techniques such as how to organize your code, and how to require extra paths into the code. Then how to perform tests using JUnit 4. There are also JavaDoc markup in the code as well to demonstrate how to do JavaDoc documentation. 

## Building

Using Apache Ant:
```bash
ant -p # Get all Ant tasks
ant    # Default task. clean, compile
```

Using JRuby:
```bash
jruby -S rake --tasks # List available Rake tasks.
jruby -S rake         # Default task. clean, compile.
```

## Testing

Using Apache Ant:
```bash
ant junit-test # Compiles, gets testing libraries, and compiles tests.
```

Using JRuby:
```bash
jruby -S rake junit_test
```

## Usage

To use in a Java file, import as `import sample.SampleClass` in order to get access to the functions in the class files. To use in JRuby, look at the `jruby_junit_example_01.rb` file to see how to require the class files and use them. For some reason, the JAR loading method mentioned in the Calling Java From Ruby Wiki wasn't working for me, even including the path where the JAR file was located.

## References

* [JRuby Homepage](http://jruby.org/)
* [JRuby Wiki Getting Started](https://github.com/jruby/jruby/wiki/GettingStarted)
* [JRuby Wiki Calling Java from Ruby](https://github.com/jruby/jruby/wiki/CallingJavaFromJRuby)
* [JRuby Wiki Code Examples](https://github.com/jruby/jruby/wiki/JRubyAndJavaCodeExamples)
