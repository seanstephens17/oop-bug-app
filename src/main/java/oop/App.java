package oop;

import java.util.ArrayList;

/**
 * Person App
 * Simple class to model a Person
 */
public class App 
{
    public static void main( String[] args ) {
        System.out.println( "\n*** Person App ***" );
        App app = new App();
        app.start();
    }

    public void start() {
        // Create (instantiate) a new Person object
        // Initialize it by passing argument values into the constructor
        // The reference "person1" is assigned a reference to the new Person object
        // (person1 points at the Person object) -


        Person person1 = new Person("Taylor Swift", "Reading, Pennsylvania", 25);
        //TODO Draw a diagram (on paper) to show te reference person1
        // pointing to the Person object.

        System.out.println("person1 name: " + person1.getName());
        System.out.println("person1 address: " + person1.getAddress());
        System.out.println("person1 age: " + person1.getAge());

        // Create an object using no-argument constructor
        Person person2 = new Person();
        System.out.println();
        System.out.println("person2 name :" + person2.getName());
        System.out.println("[name is blank above because no-arg constructor set it to an empty string]");

        // Set the instance fields of the Person
        // object person2 using the setter methods
        person2.setName("Andrew Hozier-Byrne");
        person2.setAddress("Bray, Co. Wicklow");
        person2.setAge(25);

        System.out.println();
        System.out.println("person2 name: " + person2.getName());
        System.out.println("person2 address: " + person2.getAddress());
        System.out.println("person2 age: " + person2.getAge());

        System.out.println("");
        System.out.println("Display person1 using toString() : " + person2.toString() );
        System.out.println("Display person1 using toString() : " + person2 );   // will call toString() on object

        //TODO
        // Implement a toString( ) method in the Person class, and run this App again
        // to see how the toString() outputs the contents of the object properly.

        System.out.println("Display person1 using printPerson() : \n" + person2.printPerson() );

        System.out.println("Declare Arraylist of People");
        ArrayList<Person> people = new ArrayList<>();
        people.add(person1);
        people.add(person2);

        for(Person p: people){
            p.printPerson();
        }



    }
}
