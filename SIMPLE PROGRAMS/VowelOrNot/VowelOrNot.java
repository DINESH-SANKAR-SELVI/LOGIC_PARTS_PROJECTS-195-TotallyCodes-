import java.io.*;
import java.util.Scanner;

class VowelOrNot {
    public static void main(String[] args) {

        Scanner io = new Scanner(System.in);
        String input = "";
        System.out.println("ENTER THE SEQUENCE : ");
        input = io.nextLine();
        for (int i = 0; i < input.length(); i++) {
            switch (input.charAt(i)) {

                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    System.out.println(input.charAt(i) + " - " + "That Is Vowel");
                    break;
                default:
                    System.out.println(input.charAt(i) + " - " + "Not a Vowel");
            }
        }
    }
}