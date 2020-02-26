package md222xq_assign2;
import java.util.Scanner;

public class CalcNumbers {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("This program will sum up all the values you input until you input 0");

        int sum = 0;
        int inputVal = -1;

        while (inputVal != 0){
            System.out.print("Please input a value (inputting 0 ends the loop): ");
            inputVal = input.nextInt();
            sum = sum + inputVal;


        }


            System.out.print(sum);



    }


}
