package md222xq_assign1;
import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);     //initialise scanner


        System.out.print("Enter Point x1: ");       //request input for variables
        double x1;
        x1 = input.nextDouble();

        System.out.print("Enter Point x2: ");
        double x2;
        x2 = input.nextDouble();

        System.out.print("Enter Point y1: ");
        double y1;
        y1 = input.nextDouble();

        System.out.print("Enter Point y2: ");
        double y2;
        y2 = input.nextDouble();

        double distance;

        distance = Math.pow((x1-x2), 2) + Math.pow((y1-y2), 2);         //distance equation
        distance = (float)Math.sqrt(distance);                          //distance equation + convert from double to float to be able to convert to 3 significant figures


        System.out.println(Math.round(distance * 1000.0) / 1000.0);     //round to 3 siginificant figures

        input.close();          //close scanner


        }
    }

