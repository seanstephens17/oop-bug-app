package oop;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Testing the Person class
     */

    // Test constructor and getter methods.
    @Test
    public void constructorTest() {
        Person obj = new Person("Tom","Dundalk", 21);
        assertEquals("Name", "Tom", obj.getName() );
        assertEquals("Address", "Dundalk", obj.getAddress());
        assertEquals(21,obj.getAge());
    }

    //TODO
    // Other tests can be added below.
    // Refer to your Testing module for guidance
}
