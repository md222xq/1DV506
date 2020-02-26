package md222xq_assign4;

import java.util.Scanner;

public class BetterDateFormat {

    public static void Betterdate () throws Exception {

        while (true) {


            Scanner input = new Scanner(System.in);

            System.out.println("input year(number): ");
            int year = input.nextInt();

            System.out.println("Please input month(number): ");
            int month = input.nextInt();

            System.out.println("Please input day(number): ");
            int day = input.nextInt();


            if (year == 0) {
                System.out.println("Bye, bye!");
                System.exit(0);
            }

            if (month > 12) {
                throw new IndexOutOfBoundsException("No, that is not possible, error is: Month must be between 1 and 12");
            }

            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                if (day > 31) {
                    throw new Exception();
                }
            }

            if (month == 4 || month == 6 || month == 9 || month == 11) {
                if (day > 30)
                    throw new Exception();
            }

            if (month == 2) {
                if (day > 29) {
                    throw new Exception();
                }
            }

            else{
                System.out.println("The date is: "+ day + "/" + month + "/" + year);
            }

        }
    }


    public static void main(String[] args) throws Exception {
        try{
            Betterdate();

        }catch (IndexOutOfBoundsException e){
            System.out.println("No, that is not possible, error is: Month must be between 1 and 12");
        }catch (Exception e){
            System.out.println("No, that is not possible, error is: Not a valid day that month.");
        }









    }

}
