#!/usr/bin/env jruby
# encoding: UTF-8

require 'java'

# Using Java Class files and upating the CLASSPATH
#$CLASSPATH << 'build/classes/main'
# Using Java JAR files need to be in classpath by JAR name and path to it.
$CLASSPATH << 'build/jars/SampleClass.jar'
java_import 'sample.SampleClass'

sample_class = Java::sample::SampleClass

puts sample_class.print_hello
puts sample_class.print_words

Java::sample::SampleClass.print_hello
Java::sample::SampleClass.print_words
