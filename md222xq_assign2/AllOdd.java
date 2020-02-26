package md222xq_assign2;

import java.util.ArrayList;
import java.util.Random;

public class AllOdd {
    public static void main(String[] args) {
        Random number = new Random();

        int[] box = new int[10];
        for(int i=0;i<10;i++){
            box[i]=number.nextInt(100)+1;
        }
        //print out
        System.out.print("Complete array: ");
        for(int i=0;i<box.length;i++){
            System.out.print(box[i]+" ");
        }
        System.out.print("\nAll Odd numbers");
        for(int i=0;i<box.length;i++){
            if ((box[i])%2 != 0){
                System.out.print(box[i]+" ");
            }
        }

    }
}
