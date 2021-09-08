package session0.B_ClassesAndObjects;

/**
 * Write a class to represent a person. A person has a first name, last name, and an age.
 * Write code that create a person object and outputs the person's information as a string
 * formatted as ”Anders, Madsen, 28”
 */
class Person {

    //Add the instance variables
    String firstname;
    String lastname;
    int age;

    public static void main(String[] args) {

        //Create the object
        Person person = new Person();

        //Assign the values to the instance variables
        person.firstname="Anders";
        person.lastname="Madsen";
        person.age = 28;

        //Print the person's information as a string formatted as ”Anders, Madsen, 28”
        System.out.println(person.firstname+", "+person.lastname+", "+person.age);

    }

}
