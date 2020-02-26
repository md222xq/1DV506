package md222xq_assign1;
import java.util.*;

public class Nine {
    public static void main(String [] args) {

        Random rd = new Random ();
        int random1;
        int random2;
        int sum1;
        int resultPlayer = 0;



        char newLine = '\n';
        System.out.println("============================================");
        System.out.println("=========== Welcome to the Game ============");
        System.out.println("============================================");
        System.out.print("Ready to play?  (Y/N) ");

        Scanner input = new Scanner(System.in);
        char choice;
        choice = input.next().charAt(0);

        if ( choice == 'y' || choice == 'Y')
        {
            System.out.println("The game has begun, goodluck!");
            random1 = rd.nextInt(5);
            random1 = random1 + 1;
            System.out.println("You rolled: " + random1);
            resultPlayer = random1;

            System.out.print("Would you like to roll again? (Y/N) ");
            choice = input.next().charAt(0);

                if ( choice == 'y' || choice == 'Y')
                {

                    random2 = rd.nextInt(5);
                    random2 = random2 + 1;


                    sum1 = random1 + random2;
                    resultPlayer = sum1;
                    System.out.println("You rolled: " + random2 + ". Your total sum is: " + sum1);
                }

                else
                {
                    System.out.println("Alright, you rolled " + resultPlayer + "");
                }


        }

        else
        {
            System.out.print("Have a good day!");
        }

        int randomPC;
        int randomPC2;
        int randomPCsum;
        int resultPC = 0;

        System.out.println("Now the computer will roll. Be prepared!");
        randomPC = rd.nextInt(5) + 1;

        System.out.println("Computer has rolled: " + randomPC);

        resultPC = randomPC;

        if ( randomPC < 5 )
        {
            randomPC2 = rd.nextInt(5)+1;
            randomPCsum = randomPC + randomPC2;
            System.out.println("Computer has rolled again and got: " + randomPC2 + "");
            System.out.println("Computer total rolled is: " + randomPCsum + " ");
            resultPC = randomPCsum;
        }

        else if ( randomPC > 5)
        {
            System.out.print("Computer decides not to roll again");
            resultPC = randomPC;
        }



        System.out.println("Lets take a look at the results: ");
        System.out.println("You rolled: " + resultPlayer + "" + " PC rolled: " + resultPC);


        if ( resultPlayer == resultPC)
        {
            System.out.print("Its a tie!, Good luck next time");
        }

        else if ( resultPlayer > resultPC && resultPlayer <10)
        {
            System.out.print("Congratulations You Win!");
        }

        else if (resultPlayer < resultPC && resultPC < 10)
        {
            System.out.print("Sorry you've lost.");
        }

        else if (resultPlayer > 10 && resultPC > 10)
        {
            System.out.print("Its a tie!");
        }

        else if (resultPlayer >= 10 && resultPC < 10)
        {
            System.out.print("Looks like you lost.");
        }

        else if (resultPlayer <= 10 && resultPC > 10)
        {
            System.out.print("Congrats you Win!");
        }

        input.close();
    }

}
