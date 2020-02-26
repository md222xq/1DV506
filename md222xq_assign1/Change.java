package md222xq_assign1;
import java.util.Scanner;

public class Change {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please Input Item Price: ");      //print out user
        double price = input.nextDouble();       //we input item priceinstruction

        System.out.print("Please Input Amount Received: ");     //print out user instruction
        double moneyReceived = input.nextDouble();       //identify money received as int

        int change = (int) (moneyReceived - price);     //calculate total change

        System.out.println("Total Change amounts to " + change + " SEK");

        int thousand;
        int fiveHundred;
        int twoHundred;
        int oneHundred;
        int fifty;
        int twenty;
        int ten;
        int five;
        int two;
        int one;



            thousand = change / 1000;

            fiveHundred = change % 1000;
            fiveHundred = fiveHundred / 500;

            twoHundred = change % 1000;
            twoHundred = twoHundred % 500;
            twoHundred = twoHundred / 200;

            oneHundred = change % 1000;
            oneHundred = oneHundred % 500;
            oneHundred = oneHundred % 200;
            oneHundred = oneHundred / 100;

            fifty = change % 1000;
            fifty = fifty % 500;
            fifty = fifty % 200;
            fifty = fifty % 100;
            fifty = fifty / 50;

            twenty = change % 1000;
            twenty = twenty % 500;
            twenty = twenty % 200;
            twenty = twenty % 100;
            twenty = twenty % 50;
            twenty = twenty / 20;

            ten = change % 1000;
            ten = ten % 500;
            ten = ten % 200;
            ten = ten % 100;
            ten = ten % 50;
            ten = ten % 20;
            ten = ten / 10;

            five = change % 1000;
            five = five % 500;
            five = five % 200;
            five = five % 100;
            five = five % 50;
            five = five % 20;
            five = five % 10;
            five = five / 5;

            two = change % 1000;
            two = two % 500;
            two = two % 200;
            two = two % 100;
            two = two % 50;
            two = two % 20;
            two = two % 10;
            two = two % 5;
            two = two / 2;

            one = change % 1000;
            one = one % 500;
            one = one % 200;
            one = one % 100;
            one = one % 50;
            one = one % 20;
            one = one % 10;
            one = one % 5;
            one = one % 2;
            one = one / 1;



        System.out.println("1000 kr bills:  " + thousand);
        System.out.println("500 kr bills: " + fiveHundred);
        System.out.println("200 kr bills:  " + twoHundred);
        System.out.println("100 kr bills:  " + oneHundred);
        System.out.println("50 kr bills:  " + fifty);
        System.out.println("20 kr bills:  " + twenty);
        System.out.println("10 kr bills:  " + ten);
        System.out.println("5 kr bills:  " + five);
        System.out.println("2 kr bills:  " + two);
        System.out.println("1 kr bills:  " + one);

        input.close();

    }
}
