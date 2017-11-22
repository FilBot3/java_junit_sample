#!/usr/bin/env jruby
# encoding: UTF-8

require 'java'

# Using Java Class files and upating the CLASSPATH
$CLASSPATH << 'build/classes/main'
java_import 'sample.SampleClass'

sample_class = Java::sample::SampleClass

puts sample_class.print_hello
puts sample_class.print_words
