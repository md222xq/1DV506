package md222xq_assign1;
import java.util.Scanner;
public class Area {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Provide radius: ");

        float radius;
            radius = input.nextFloat();


        float area;
            area = (float)(Math.PI * Math.pow(radius, 2.0));


        double total;
        total = Math.round((area) * 10) / 10.0;

        System.out.print("Area of a circle with radius " + radius + " " + "is " + total);

        input.close();


    }
}
