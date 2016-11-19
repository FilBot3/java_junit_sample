/**
 * Setting the main package package name.
 *  Just for organization of code. 
 */
package sample;

/**
 * Import a custom library from inside the code repository. 
 * Make sure to use the full path of packages. 
 */
import sample.version.Version;

/**
 * A sample class to inherit methods from in the main class. 
 * There can only be one main function and class per application, and class file. 
 */
class Dog {
    /**
     * print_words displays text on the screen.
     * 
     * @param none
     * @return none
     */
    public void print_words() {
        System.out.println("Inherited Class");
    }
}

/** 
 * Entry point into the application. 
 * This is the main file and class for the application.
 * The JAR and Classes will be ran from here. 
 */
public class SampleClass extends Dog {
    /**
     * print_words displays text on the screen.
     * 
     * @param none
     * @return String (Hello World!)
     */
    public static String print_hello() {
        System.out.println("Hello World!");
        String string_to_return = "Hello World!";
        return string_to_return;
    }

    /** 
     * Main, the entry point for the Application
     * 
     * @param none
     * @return none
     */
    public static void main(String[] args) {
        print_hello();
        SampleClass sc = new SampleClass();
        sc.print_words();
        Version ver = new Version();
        ver.VERSION();
    }
}

