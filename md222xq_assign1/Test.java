package md222xq_assign1;

import java.util.Scanner;


public class Test {


        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Price : ");
            double price = sc.nextDouble(); // we take the price of the product in double

            System.out.print("Payment : ");
            double payment = sc.nextDouble(); // we take the payment in double

            // Change

            int change = (int) (payment - price); //difference between payment and price
            System.out.println("Change : " +change + " kronor"); // we print out the difference

            sc.close();

            //Swedish bills and coins that should be returned rounded off to nearest kr


            int a = change/1000;

            int moneyToGive = a; //1000kr
            a = change%1000;

            int moneyToGive2 = a/500; //500kr, moneyToGive2 = (change%1000)/500 trouver le reste de 1000 puis on le devise par 500
            a = a%500;

            int moneyToGive3 = a/200; //200kr
            a = a%200;

            int moneyToGive4 = a/100; //100kr
            a = a%100;

            int moneyToGive5 = a/50; //50kr
            a = a%50;

            int moneyToGive6 = a/20; //20kr
            a = a%20;

            int moneyToGive7 = a/10; //10kr
            a = a%10;

            int moneyToGive8 = a/5; //5kr
            a = a%5;

            int moneyToGive9 = a/2; //2kr
            a = a%2;

            int moneyToGive10 = a/1; //1kr





            System.out.println("1000kr bills : " +moneyToGive);
            System.out.println("500kr  bills : " +moneyToGive2);
            System.out.println("200kr  bills : " +moneyToGive3);
            System.out.println("100kr  bills : " +moneyToGive4);
            System.out.println("50kr   bills : " +moneyToGive5);
            System.out.println("20kr   bills : " +moneyToGive6);
            System.out.println("10kr   coins : " +moneyToGive7);
            System.out.println("5kr    coins : " +moneyToGive8);
            System.out.println("2kr    coins : " +moneyToGive9);
            System.out.println("1kr    coins : " +moneyToGive10);








        }
    }