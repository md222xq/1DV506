package md222xq_assign2;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        boolean running =true;
        while(running) {
            System.out.print("Input integer: ");
            Scanner input = new Scanner(System.in);
            int number = input.nextInt();

            if(number<0){
                System.out.println("Bye");
                break;
            }else {

                for (int i = 2; i < number; i++) {
                    if (number % i == 0 || number == i) {
                        System.out.println("Not Prime!");
                        break;
                    } else if (i == number - 1) {
                        System.out.println("This is Prime!");
                    }
                }
            }

        }

    }
}
