package EXAM;

import java.util.Scanner;

public class Divisible {

    public static void main(String[] args) {
        System.out.println("Enter upper boundry: ");
        Scanner input = new Scanner(System.in);
        int upper = input.nextInt();

        int count=0;
        for (int i = 1; i < upper; i++) {

            if (i % 6 == 0 || i % 7 == 0) {


                count++;

                if (count % 10 == 0) {
                    System.out.println();
                } else {
                    System.out.print(i + " ");

                }


            } else {

            }


        }


    }
}
