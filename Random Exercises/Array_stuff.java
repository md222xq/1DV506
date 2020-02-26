package Test_package;

import java.util.Scanner;

public class Array_stuff {

    public static void sum () {

        int[] numbers = {5, 10, 20};
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }

        System.out.print("This is the sum: " + sum);
        System.out.println(" ");
    }


    public static void integer (){
        Scanner input = new Scanner(System.in);
        System.out.print("please input size of array: ");
        int size = input.nextInt();

        System.out.println("You have now created an array that holds " + size + " integers.");
        System.out.println("Please fill the array");

        int [] data = new int[size];
        for (int i=0; i<size; i++){
            System.out.print("integer " + (i+1) + " : ");
            data [i] = input.nextInt();
        }
        System.out.println("All integers: ");
        for (int i=0; i<size; i++){
            System.out.print(data[i] + ", ");
        }
    }

    public static void stringArray(){

        String [] array = new String [3];
        array[0] = "Hello";
        array[1] = "Good Bye";
        array[2] = "Test";

        for ( String str : array){
            System.out.println("Output : " + str);
        }
    }

    public static void charArray(){
        char[] char1 = {'g','f', 'w', 'e'};
        System.out.println("number of elements: " + char1.length);

        for (int i = 0;i<char1.length;i++){
            System.out.println(char1[i]);
        }
    }

















    public static void main(String[] args) {
        //sum();
        //System.out.println("------------------------------ ");
        //stringArray();
        //System.out.println("------------------------------ ");
        //integer();
        //System.out.println("------------------------------ ");
        //charArray();












    }
}
