package md222xq_assign2;
import java.util.Scanner;

public class DangerousWork {
    public static void main(String[] args){

        double money = 0;
        double income = 0;
        int days = 0;

        System.out.print("Input the amount of money wou want: ");
        Scanner input = new Scanner(System.in);
        money = input.nextInt();


        while ( days <=30 && income<money ){
            income = income + 0.01 * Math.pow(2.0, days);
            days++;
        }
        if (days>30){
            System.out.print("You will die");
        }

        else{
            System.out.print("You will earn your money in " + days + " days. ");
        }

        input.close();



    }

}
