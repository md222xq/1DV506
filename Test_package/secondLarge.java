package Test_package;

import java.util.Scanner;

public class secondLarge {
    public static void main(String[] args) {

        int one = -999099;
        int two = -999999;


        Scanner input=new Scanner(System.in);

        for(int i =1;i<11; i++){
            System.out.println("input value: no."+i);
            int number = input.nextInt();


            if  (number > one){
                two = one;
                one = number;
            }

            else if (number>two){
                two =number;
            }
        }
        System.out.println("max"+one);
        System.out.println("sexond max"+two);



    }
}
