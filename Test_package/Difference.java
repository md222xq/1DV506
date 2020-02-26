package Test_package;

import java.util.Scanner;

public class Difference {

    public static int difference (int a, int b){
        if (a > b)
            return a - b;
        else
            return b - a;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input int a");
        int a = input.nextInt();

        System.out.println("Input int b");
        int b = input.nextInt();
        input.close();

        System.out.println("The difference is " + difference( a, b));

    }







}
