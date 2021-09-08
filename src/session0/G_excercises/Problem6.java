package session0.G_excercises;

import java.util.Scanner;

class Problem6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character : ");
        char ch=scanner.nextLine().charAt(0);

        switch(ch)
        {
            case 'a' :
            case 'e' :
            case 'i' :
            case 'o' :
            case 'u' :
            case 'A' :
            case 'E' :
            case 'I' :
            case 'O' :
            case 'U' :
                System.out.println("Entered character "+ch+" is  Vowel");
            break;

            default:
                if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
                    System.out.println("Entered character "+ch+" is Consonant");
                else
                    System.out.println("Not in the alphabet");
        }

        String a = "a";

        StringBuilder sb=new StringBuilder(a);

        sb.reverse();

        sb.toString().toUpperCase();

    }
}

