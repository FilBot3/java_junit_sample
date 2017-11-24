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

I could potentially use JRuby and Ruby's RSpec or Minitest to perform tests against the Java code as well. It won't be as efficient or as fast, but if you're comfortable with Ruby testing you can do it that way. JUnit testing does require more steps such as compiling the JUnit code, then running it, it will be much faster.

## Usage

To use in a Java file, import as `import sample.SampleClass` in order to get access to the functions in the class files. To use in JRuby, look at the `jruby_junit_example_01.rb` file to see how to require the class files and use them. To use the JAR file in JRuby, make sure you modify your `$CLASSPATH` in the JRuby script, or when calling JRuby make sure its in the classpath in the command-line. In this example, $CLASSPATH is modified in the JRuby script.

Using Ant and Java
```bash
ant -p        # View available tasks
ant run-class # Run the compiled class files
ant run-jar   # Run the generated JAR file if its executable.
java -jar build/jars/SampleClass.jar 
```

Using JRuby and JRuby scripts
```bash
jruby -S rake --tasks              # View JRuby Rake tasks
jruby -S rake run_class            # Run the compiled class files
jruby -S rake run_jar              # Run the generated JAR files
jruby -S jruby_junit_example_01.rb # Run the example JRuby script
```


## References

* [JRuby Homepage](http://jruby.org/)
* [JRuby Wiki Getting Started](https://github.com/jruby/jruby/wiki/GettingStarted)
* [JRuby Wiki Calling Java from Ruby](https://github.com/jruby/jruby/wiki/CallingJavaFromJRuby)
* [JRuby Wiki Code Examples](https://github.com/jruby/jruby/wiki/JRubyAndJavaCodeExamples)
