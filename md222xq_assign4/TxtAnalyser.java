package md222xq_assign4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TxtAnalyser {
    public static void main(String[] args) {

        int totalLines = 0;
        int emptyLines = 0;
        int numLines = 0;
        int counterNumber;



        StringBuilder text = new StringBuilder();
        try{
            File file = new File("/Users/malek/Java/lovecraft.txt");
            Scanner scan = new Scanner(file);

            while (scan.hasNext()){
                counterNumber =0;
                String str = scan.nextLine();


                if (str.isEmpty()){
                    emptyLines++;
                }

                if (!str.isEmpty()) {

                    for (int i = 0; i < str.length(); i++) {
                        if (Character.isDigit(str.charAt(i))) {
                            counterNumber++;
                        }
                    }
                    if (counterNumber == str.length()-1 ) {
                        numLines++;
                    }
                }




                totalLines++;
                text.append(str + "\n");
            }

            int textLines = totalLines-emptyLines-numLines;
            System.out.println("Lovecraft Statistics: ");
            System.out.println("Total lines:            " + totalLines);
            System.out.println("Empty Lines:            " + emptyLines);
            System.out.println("Lines with text:        " + textLines);
            System.out.println("Lines with page number: " + numLines);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }

}
