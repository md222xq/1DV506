package md222xq_assign1;

import java.util.Scanner;       //Get scanner from lib.

public class Quote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print ("Insert text you want to quote:");      //user instruction
        String text = sc.nextLine();     //read string
        System.out.println ("Quotes have been added: " + "\"" + text + "\"");     //print string

        sc. close();        //close scanner

    }
}
