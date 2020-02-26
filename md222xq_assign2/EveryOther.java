package md222xq_assign2;
import java.util.Scanner;

public class EveryOther {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please input first integer: ");
        int value1 = input.nextInt();

        System.out.print("Please input last integer: ");
        int value2 = input.nextInt();

        int max = 0;
        int min = 0;


        if (value1 > value2){
            max = value1;
            min = value2;

        }
        else {
            max = value2;
            min = value1;
        }


        int loopValue = min;
        int endValue = max;



        for (loopValue = min; loopValue < endValue; loopValue = loopValue + 2) {
            System.out.print(loopValue + " ");
        }

        input.close();










    }


}

