package session0.D_Methods;

/**
 * Start from Person class in Section B.
 *     - Add a method that returns whether the person is or not under the legal age (18 years old).
 *     - Add a method that returns a string formatted as ”Anders, Madsen, 28, Above Legal Age”
 */
class Person {

    //Add the instance variables or fields
    String firstName;
    String lastName;
    int age;


    // Add the methods
    /**
     * This method returns a boolean indicating whether the person is or not under the legal age (18 years old)
     * @return True if the person below 18 years old.
     */
    boolean underLegalAge(){
        if (this.age<18)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {

        //Create the object
        Person person = new Person();

        //Assign the values to the instance variables
        person.firstName="Anders";
        person.lastName="Madsen";
        person.age = 8;

        person.underLegalAge();

        //Print the person's information as a string formatted as ”Anders, Madsen, 28, Above the Legal Age”
        System.out.println(person.firstName+", "
                            +person.lastName+", "
                            +person.age + ", "
                            + ((person.underLegalAge())? "Under the Legal Age": "Above the Legal Age"));


        //Print the person's information as a string formatted as ”Anders, Madsen, 28, Above the Legal Age”
        System.out.print(person.firstName+", "
                +person.lastName+", "
                +person.age + ", ");

        if (person.underLegalAge())
            System.out.println("Under the Legal Age");
        else
            System.out.println("Above the Legal Age");


    }

}
