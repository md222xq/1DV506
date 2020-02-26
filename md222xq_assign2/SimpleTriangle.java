package md222xq_assign2;
import java.util.Scanner;

public class SimpleTriangle {
    public static void main(String[] args) {

        System.out.print("Enter a positive integer: ");
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        if (number < 0) {
            System.out.print("You have entered an invalid number.");
        }
        else {
            int lines;
            int space;
            int star;


            for (lines = 0; lines < number; lines++) {
                for (space = 0; space < lines; space++) {
                    System.out.print(" ");
                }
                for (star = lines; star < number; star++) {
                    System.out.print("*");
                }

                System.out.println(" ");
            }


        }











    }
}
