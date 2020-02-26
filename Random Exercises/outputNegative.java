package Test_package;

import java.util.ArrayList;
import java.util.Scanner;

public class outputNegative {

    public static void main(String[] args) {
        System.out.println("Enter an integer (if int = negative program ends): ");
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();



        while (true){

            int value = input.nextInt();

            if(value<0){
                break;
            }

            else{
                arrayList.add(value);
            }
        }

        for (int i = 0; i <arrayList.size(); i++){
            if ( arrayList.get(i) %2==1){
                System.out.print(arrayList.get(i) + " ");
            }

        }



    }

}
