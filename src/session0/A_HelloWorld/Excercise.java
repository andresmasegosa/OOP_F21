package session0.A_HelloWorld;

import java.util.Scanner;

/**
 * Write a program that converts a length in feet to meters. The program should read the length from standard in
 * and output the result to standard out.
 */
class Excercise {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the number of feet: ");

        // Takes an string from standard in and convert it to an integer
        int feet = Integer.valueOf(scanner.nextLine()).intValue();

        double meters = feet*0.3048;

        // Print the conversion
        System.out.println(feet+" feet equal "+meters + " meters.");
    }
}
