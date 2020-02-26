package md222xq_assign2;
import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int large = -999999;
        int secondLarge = -999999;


        for (int i=1; i<11; i++){
            System.out.print("Input integer number " + i + " :");
            int number = input.nextInt();

            if (number > large) {
                secondLarge = large;
                large = number;
            }
            else if(number > secondLarge){
                secondLarge=number;
            }







        }

        input.close();
        System.out.print(secondLarge);




    }
}
