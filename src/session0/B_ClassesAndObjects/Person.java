package session0.B_ClassesAndObjects;

/**
 * Write a class to represent a person. A person has a first name, last name, and an age.
 * Write code that create a person object and outputs the person's information as a string
 * formatted as ”Anders, Madsen, 28”
 */
class Person {

    //Add the instance variables
    String firstName;
    String lastName;
    int age;

    public static void main(String[] args) {

        //Create the object
        Person person = new Person();

        //Assign the values to the instance variables
        person.firstName="Anders";
        person.lastName="Madsen";
        person.age = 28;

        //Print the person's information as a string formatted as ”Anders, Madsen, 28”
        System.out.println(person.firstName+", "+person.lastName+", "+person.age);

    }

}
