package string;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String string = input.nextLine();
        int length = string.length();

        String reverseString = "";
        for (int i = length - 1; i >= 0; i--) {
            reverseString = reverseString + string.charAt(i);
        }

        System.out.println("Reversed String is: " + reverseString);
        input.close();
    }
}
