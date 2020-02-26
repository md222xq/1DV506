package md222xq_assign1;
import java.util.Scanner;

public class SumofThree {
    public static void main(String[] args) {

        System.out.print ("Please provide a three digit number to compute:");

        Scanner input = new Scanner (System.in);        //Start scanner

        int inputDigits = input.nextInt();     //specify input as int
        int digit1;     //specify digits 1,2,3 as int
        int digit2;
        int digit3;

        digit1 = inputDigits / 100;
        digit2 = (inputDigits % 100) / 10;
        digit3 = (inputDigits % 100) % 10;

        System.out.print(digit1 + digit2 + digit3);

        input.close();

    }
}
