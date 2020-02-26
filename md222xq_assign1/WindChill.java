package md222xq_assign1;
import java.util.Scanner;

public class WindChill {
    public  static void main(String[] args) {


        System.out.println("This program computes the Wind Chill Temperature Twc.");    //announces the program intention

        Scanner input = new Scanner(System.in);     //intialise scanner

        System.out.print("Please enter temperature in °C: ");       //print instructions, temperature=double + input of scanner
        double temperature;
        temperature = input.nextDouble();

        if (temperature > 10) {
            System.out.println("Windchill Temperature is only defined for temperatures at or below 10 °C.");
        }
        else {
            System.out.print("Please enter wind speed meassured in m/s: "); //print instructions, speed in m/s=double + input of scanner
        }

        double windSpeedms;
        windSpeedms = input.nextDouble();

        double windSpeedkmh;
        windSpeedkmh = windSpeedms * 3.6;  //convert m/s to km/h

        if (windSpeedkmh < 4.8)
        {
            System.out.print("Windchill Temperature is only defined for wind speed above 4.8km/h or 1.3m/s. ");
        }

        else
        {
            double twc;
            twc = 13.2+0.6215*(temperature) - 11.37*(Math.pow (windSpeedkmh, 0.16)) + 0.3965*(temperature)*(Math.pow (windSpeedkmh, 0.16));
            twc = Math.round(twc * 10) / 10;
            System.out.print(twc);
        }


        input.close();


    }
}
