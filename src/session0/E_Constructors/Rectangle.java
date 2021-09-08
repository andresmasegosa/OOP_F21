package session0.E_Constructors;

/**
 * Exercise:
 *  * Write a class to represent a rectangle.
 *  * A rectangle has both a width and height.
 *  * Create two constructors for this class.
 *      * A constructor with the standard two parameters.
 *      * A constructor with only one parameter that assumes the rectangle is a square.
 *  * Add two methods to compute the perimeter and the area of the rectangle.
 *
 * */
class Rectangle {

    //Add the member variables or fields
    double width;

    double height;

    // Add the constructors
    Rectangle(double width, double height){
        this.width=width;
        this.height=height;
    }

    Rectangle(double val){
        this.width=val;
        this.height=val;
    }

    // Add the methods
    double perimeter(){
        return 2*(this.width+this.height);
    }
    double area(){
        return this.width*this.height;
    }

    public static void main(String[] args) {

        //Create a rectangle
        Rectangle rectangle = new Rectangle(20, 10);

        //Print the perimeter and the area of the rectangle.
        System.out.println("Perimeter: "+rectangle.perimeter());
        System.out.println("Area: "+rectangle.area());
        System.out.println();

        //Create a square
        Rectangle square = new Rectangle(10);

        //Print the perimeter and the area of the rectangle.
        System.out.println("Perimeter: "+square.perimeter());
        System.out.println("Area: "+square.area());


    }
}
