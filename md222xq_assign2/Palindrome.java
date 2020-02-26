package md222xq_assign2;

import java.util.ArrayList;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        boolean running = true;
        while(running) {
            Scanner input = new Scanner(System.in);
            System.out.print("\nPlease input word or phrase to check: ");
            String text = input.nextLine();
            text = text.toLowerCase();
            text = text.replaceAll(" ", "");

            if (text.equals("stop")) {
                running =false;
            } else {


                //System.out.println(text);

                //System.out.println(text);


                for (int i = 0; i < text.length() / 2; i++) {

                    char help1 = text.charAt(i);
                    char help2 = text.charAt(text.length() - 1 - i);


                    if (help1 != help2) {
                        System.out.println("Not a Palindrome!");
                        break;
                    } else if (i == (text.length() / 2) - 1) {
                        System.out.print("This is a palindrome. ");
                    }
                }

            }

        }


    }
}
