package md222xq_assign1;

import java.util.Scanner;       //import scanner

public class Fahrenheit {
    public static void main(String[] args) {
        float temperature;

        Scanner in = new Scanner(System.in);
        System.out.println ("Insert temperature in Farhenheit:");      //user instruction
        temperature = in.nextInt();

        //conversion
        float result = (temperature-32)*5/9;



        System.out.print ("Temperature in Celsius is " + result); //print out result

        in.close();



    }
}


