package md222xq_assign4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


/*
By running my code we achieve a word count of 634479 words.
One reason for counting more words is due to the amount of conditions I have included.
In total I have included 11 conditions.
The way my code functions is, it looks for a letter and if the character after the letter is one of the following:

1: (space)          6: ;            11: )
2: . (full stop)    7: '
3: , (comma)        8: "
4: -                9: !
5: :                10: ?

it will consider it a be a word.









 */









public class CountingWords {
    public static void main(String[] args) {

        try {
            File file = new File("/Users/malek/Java/lovecraft.txt");
            Scanner scan = new Scanner(file);
            int count = 0;

            while (scan.hasNext()) {

                String str = scan.nextLine();

                for (int i = 0; i < str.length(); i++) {
                    if (Character.isAlphabetic(str.charAt(i))) {
                        //631330
                        if (str.charAt(i + 1) == ' ') {
                            count++;
                        }else if (str.charAt(i + 1) == '.') {
                            count++;
                        }else if (str.charAt(i + 1) == ',') {
                            count++;
                        }else if (str.charAt(i + 1) == '\'') {
                            count++;
                        }
                        else if (str.charAt(i + 1) == '"') {
                            count++;
                        }
                        else if (str.charAt(i + 1) == ':') {
                            count++;
                        }
                        else if (str.charAt(i + 1) == '!') {
                            count++;
                        }
                        else if (str.charAt(i + 1) == '?') {
                            count++;
                        }
                        else if (str.charAt(i + 1) == ';') {
                            count++;
                        }
                        else if (str.charAt(i + 1) == ')') {
                            count++;
                        }
//
                        else if (str.charAt(i + 1) == '-') {
                            if (Character.isAlphabetic (str.charAt(i)+2)){
                                count++;
                            }
                        }
                    }

                }}
                System.out.println(count);

            } catch(FileNotFoundException e){
                e.printStackTrace();
            }



    }




}
