package session0.G_Exercises;

import java.util.Scanner;

/**
 * Problem 6
 * @author andresmasegosa
 */
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
    }
}

