#!/usr/bin/env jruby
# encoding: UTF-8

require 'java'

# Using Java Class files and upating the CLASSPATH
#$CLASSPATH << 'build/classes/main'
# Using Java JAR files need to be in classpath by JAR name and path to it.
$CLASSPATH << 'build/jars/SampleClass.jar'
puts '=> Loading SampleClass code.'

# Import the class into our JRuby script if its in our $CLASSPATH. We could use
# both class files and JAR files. 
java_import 'sample.SampleClass'

puts '=> Creating a refence to the Java Class, SampleClass.'
sample_class = Java::sample::SampleClass

puts '=> Running print_hello and print_words methods from SampleClass.'
puts sample_class.print_hello
puts sample_class.print_words

puts '=> Calling Java Methods directly without a reference.'
puts '=> This is because they\'re public static methods.'
Java::sample::SampleClass.print_hello
Java::sample::SampleClass.print_words
puts '=> These print a single value because they have System.out.println functions'
puts '=> instead of taking the returns. This can still function like that.'
