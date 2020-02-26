package Test_package;

import java.util.ArrayList;
import java.util.Scanner;

public class CalcNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("how much i want earn");
        double want = sc.nextDouble();
        double income = 0.01;
        int days = 0;

        while (want > income){
            income =  0.01 * Math.pow(2, days);
            days++;
        }
        System.out.println(days);

        }







    }
