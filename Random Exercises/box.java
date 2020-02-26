package Test_package;

import java.util.Scanner;

public class box {
    public static void bocks (int r, int c){

        for (int i=1; i<=r ; i++){
            for (int j=1; j<=c; j++){
                if (i==1 || i==r || j==1 || j==c ){
                    System.out.print("0");
                }

                else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }


    }
    public static void main(String[] args) {

        bocks(5,10);



    }
}
