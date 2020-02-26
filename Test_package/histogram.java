package Test_package;

import java.util.Random;

public class histogram {
    public static void main(String[] args) {


        int count1=0;
        int count2=0;
        int count3=0;
        int count4=0;
        int count5=0;
        int count6=0;


        for (int i=0;i<500;i++){
            Random roll = new Random();
            int dice = roll.nextInt(6)+1;

            if (dice == 1){
                count1++;
            }
            else if (dice ==2){
                count2++;
            }
            else if (dice ==3){
                count3++;
            }
            else if (dice ==4){
                count4++;
            }
            else if (dice ==5){
                count5++;
            }
            else if (dice ==6){
                count6++;
            }
        }

        System.out.println("scores: ");

        System.out.print("one: "+ count1+": ");
        for(int i=0;i<count1;i++){
            System.out.print("X");
        }

        System.out.println();

        System.out.print("two: "+ count2+": ");
        for(int i=0;i<count2;i++){
            System.out.print("X");
        }
        System.out.println();

        System.out.print("three: "+ count3+": ");
        for(int i=0;i<count3;i++){
            System.out.print("X");
        }
        System.out.println();

        System.out.print("four: "+ count4+": ");
        for(int i=0;i<count4;i++){
            System.out.print("X");
        }
        System.out.println();

        System.out.print("five: "+ count5+": ");
        for(int i=0;i<count5;i++){
            System.out.print("X");
        }
        System.out.println();

        System.out.print("six: "+ count6+ ": ");
        for(int i=0;i<count6;i++){
            System.out.print("X");
        }

        System.out.println();
        int total = count1+count2+count3+count4+count5+count6;
        System.out.println("Total: "+total);










    }
}
