package sample;

import sample.SampleClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SampleClassTest {
    /**
     * Setup a variable to hold the class instance.
     * Scoping is important as this will be used throughout the 
     * test cases in the class. 
     */
    private SampleClass sample_class;
    
    /**
     * Perform setup tasks such as initializing the Instance or
     * Setting data for the tests instead of each test. 
     */
    @org.junit.Before
    public void beforeEach() {
        sample_class = new SampleClass();
    }

    /**
     * Use the instance variable of SampleClass, and perform the 
     * fucntion/method within that class. Void methods are tricky
     * as those don't return anything. The easiest tests are those
     * that return data to assert equals or false against. 
     */
    @org.junit.Test
    public void testSampleClass() { 
        /**
        * Perform an assetion against the SampleClass method, print_hello(), 
        * This class returns a string, and prints it as well. 
        */
        Assert.assertEquals("Hello World!", sample_class.print_hello());
    }
}
