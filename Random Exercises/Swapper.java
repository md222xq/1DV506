package Test_package;

import java.util.Random;
import java.util.Scanner;
import java.time.LocalTime;

public class Swapper {

    public static void swap (int a, int b){
        int temp = a;
        a = b;
        b = temp;


        System.out.println("After swap int a = " + a + " and int b = " + b );

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input value a");
        int a = input.nextInt();

        System.out.println("Please input value b");
        int b = input.nextInt();

        System.out.println("Before swap int a = " + a + " and int b = " + b );

        swap(a, b);






    }





}
