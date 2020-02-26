package md222xq_assign1;
import java.util.*;

public class Numbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("This program arranges three numbers from largest to smallest.");

        int number1;
        int number2;
        int number3;
        int cnt = 0;

        System.out.print("Input First Number: ");
        number1 = input.nextInt();

        System.out.print("Input Second Number: ");
        number2 = input.nextInt();

        System.out.print("Input Third Number: ");
        number3 = input.nextInt();

        System.out.println("The numbers you have entered are: " + number1 + ", " + number2 + ", " + number3);
        System.out.println("Numbers in Ascending order are: ");

        for (int i = 0; cnt != 3;i++)
        {
            if (i==number1 || i==number2 || i==number3)
            {
                System.out.print( "\t" + i);
                cnt++;
            }
        }

        input.close();


    }
    }
