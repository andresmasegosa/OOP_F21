package session0.A_HelloWorld;

import java.util.Scanner;


class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name + "!");
    }
}