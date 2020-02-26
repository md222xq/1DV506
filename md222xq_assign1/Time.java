package md222xq_assign1;
import java.util.Scanner;

public class Time {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please input value in seconds to be converted to hours, minutes, and seconds: "); //instruct user to input seconds

        int secondsInput = input.nextInt();
        int hour;
        int minute;
        int seconds;

        //Hour Conversion
         if ((secondsInput/3600)!= 0);
        {
            hour = secondsInput / 3600;
            secondsInput = secondsInput % 3600;
        }
        //Minute conversion
         if ((secondsInput/60) != 0);
        {
            minute = secondsInput/60;
            secondsInput = secondsInput%60;

        }

        //Seconds conversion
         if (secondsInput != 0);
        {
            seconds = secondsInput;
        }


        System.out.print(hour + " hours, " + minute + " minutes, and " + seconds + " seconds. "); //prints out time

        input.close();

    }
}
