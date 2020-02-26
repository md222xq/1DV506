package md222xq_assign1;
import java.util.Random;
public class RandomSum {
    public static void main(String[] args) {
        Random rd = new Random();       //create object random


        int random1;            //identify random1-5 as integers
        random1 = rd.nextInt(100);

        int random2;
        random2 = rd.nextInt(100);

        int random3;
        random3 = rd.nextInt(100);

        int random4;
        random4 = rd.nextInt(100);

        int random5;
        random5 = rd.nextInt(100);

        int randomSum;
        randomSum = random1 + random2 + random3 + random4 + random5;        //sum up all random integers

        System.out.print( "Random numbers to be summed: " + random1);       //display all random integers
        System.out.print( ", " + random2);
        System.out.print(", " +  random3);
        System.out.print(", " +  random4);
        System.out.println(", " +  random5 + " ");

        System.out.print("The sum of five random integers is: " + randomSum);       //print sum of random integers





     }
}
