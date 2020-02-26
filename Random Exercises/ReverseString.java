package Test_package;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        System.out.println("input what u want to reverse: ");
        Scanner input = new Scanner(System.in);
        String toRev = input.nextLine();

            for(int i = toRev.length()-1 ; i>=0; i--){


                System.out.print(toRev.charAt(i));
                }
    }
}
