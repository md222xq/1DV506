package Test_package;

import java.util.ArrayList;

public class Palindrome {
    public static void palindrome (String word){

        word = word.toLowerCase();
        ArrayList<Character> original = new ArrayList<>();
        for (int i = 0; i<word.length(); i++){
            original.add(word.charAt(i));
        }



        ArrayList<Character> reverse = new ArrayList<>();
        for (int i=word.length()-1 ; i >=0; i--){           //loop that takes the char in reverse order and inserts into arraylist
            reverse.add(word.charAt(i));
        }


        for (int i = 0; i <word.length(); i++){
            if (original.get(i) == reverse.get(i)){
                System.out.println("palindrome");
            }

            else{
                System.out.println("false");
            }

            break;
        }




    }


    public static void main(String[] args) {
        palindrome("loL");
        palindrome("male");
    }
}
