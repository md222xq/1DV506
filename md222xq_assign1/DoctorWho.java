package md222xq_assign1;
import java.util.Scanner;

public class DoctorWho {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char newLine = '\n';

        System.out.print("Welcome, " + newLine  + "Please enter a year to correspond to Doctor Who series: ");

        int year = input.nextInt();

        if (year < 1963)
        {
            System.out.print("Doctor Who was not yet released.");
        }

        else if (1989 > year && year > 1963 )
        {
            System.out.print("During this year the Original Series was being played.");
        }

        else if (2005 > year && year > 1989)
        {
            System.out.print("There was a pause this year lasting from 1989 till 2005");
        }

        else if (2020 > year && year > 2005)
        {
            System.out.print("That is the modern Doctor Who. ");
        }

        else
        {
            System.out.print("No news on wether Doctor Who will continue after the year 2020. ");
        }

        input.close();


    }
}
