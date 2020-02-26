package md222xq_assign2;
import java.util.*;
public class Histogram {
    public static void main(String[] args) {

        int one = 0;
        int two = 0;
        int three = 0;
        int four = 0;
        int five = 0;
        int six = 0;
        //simulation
        for (int i=0; i<500; i++){
            Random roll = new Random();
            int dice = roll.nextInt(6)+1;

            if (dice ==1 ){
                one ++;
            }

            else if(dice == 2){
                two++;
            }

            else if(dice == 3){
                three++;
            }

            else if(dice==4){
                four++;
            }

            else if(dice==5){
                five++;
            }
            else if(dice==6){
                six++;
            }

        }

        System.out.print("One  (" + one + ")");
        for(int i=0; i< one; i++){
            System.out.print("*");
        }
        System.out.println();

        System.out.print("Two  (" + two + ")");
        for(int i=0; i<two ; i++){
            System.out.print("*");
        }
        System.out.println();

        System.out.print("Three  (" + three + ")");
        for(int i=0; i<three ; i++){
            System.out.print("*");
        }
        System.out.println();


        System.out.print("Four  (" + four + ")");
        for(int i=0; i<four ; i++){
        System.out.print("*");
        }
        System.out.println();


        System.out.print("Five  (" + five + ")");
        for(int i=0; i<five ; i++){
        System.out.print("*");
        }
        System.out.println();

        System.out.print("Six  (" + six + ")");
        for(int i=0; i<six;i++){
        System.out.print("*");
        }
        System.out.println();


        Scanner sc = new Scanner(System.in);
        System.out.println("Provide an integer greater than 3 : ");
        int nbr = sc.nextInt();

        if (nbr<3){
            System.err.println("Sorry it is not higher than 3. Restart the program");
        } else {
            String star = "";
            for (int i = 0; i < nbr; i++) {
                star = star + "*";
            }

            String space = "*";
            for (int i = 0; i < nbr - 2; i++) {
                space = space + " ";
            }
            space = space + "*";
            System.out.println(star);

            for (int i = 0; i < nbr - 2; i++) {
                System.out.println(space);
            }
            System.out.println(star);


        }

        }
}
