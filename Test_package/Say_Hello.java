package Test_package;

import java.util.Scanner;

public class Say_Hello {

    public static void sayHello(){
        System.out.println("Sup");
    }

    public static void sayHello(int a){
        for(int i = 0; i<a; i++)
            sayHello();
    }



    public static void main(String[] args) {
        sayHello();

        System.out.println("Please input amount of times you'd like to say \"sup\"");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();

        sayHello(a);
    }








}
