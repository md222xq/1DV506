package Test_package;

import java.sql.SQLOutput;
import java.util.Scanner;

public class EveryOther {

    public static void everyOther (int one, int two){

        int count = one;

        for (int i =one ; one <= two ; one = one + 2){

            System.out.println(one);



            }

        }




    public static void main(String[] args) {
        System.out.println("Input first and last int: ");
        Scanner input = new Scanner(System.in);
        int first = input.nextInt();
        int last = input.nextInt();

        everyOther(first, last);


    }
}
