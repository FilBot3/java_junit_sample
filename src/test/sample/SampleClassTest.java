package sample;

import sample.SampleClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SampleClassTest {
    private SampleClass sample_class;
    
    @org.junit.Before
    public void beforeEach() {
        sample_class = new SampleClass();
    }

    /**
     *
     */
    @org.junit.Test
    public void testSampleClass() { 
        /**/
        Assert.assertEquals("Hello World!", sample_class.print_hello());
    }
}
