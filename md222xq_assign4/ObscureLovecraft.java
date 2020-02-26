package md222xq_assign4;



import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;



public class ObscureLovecraft {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome, click to proceed");
        int selection = input.nextInt();


        while (selection != 0){

            System.out.println("Obscure");
            System.out.println("=======");
            System.out.println("1. Make Obscure");
            System.out.println("2. Make Readable");
            System.out.println("3. Print Obscure");
            System.out.println("4. Print Readable");
            System.out.println("0. Exit");
            selection = input.nextInt();

            if (selection == 1) {

                try{
                    File file = new File("/Users/malek/Java/lovecraft.txt");
                    Scanner scan = new Scanner(file);
                    StringBuilder encrypted = new StringBuilder();
                        while (scan.hasNext()){

                            String str = scan.nextLine();


                            for (int i=0; i<str.length(); i++){
                                char replacedValue = (char)(str.charAt(i)+3);
                                encrypted.append(replacedValue);
                            }
                            encrypted.append("\n");
                        }
                    File obscure = new File("/Users/malek/Java/obscure.txt");
                    PrintWriter printer = new PrintWriter(obscure);
                    printer.print(encrypted);
                    printer.close();
                    scan.close();



                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }


            }

            if (selection == 2){
                try{
                    File toUnobscure = new File("/Users/malek/Java/obscure.txt");
                    Scanner scan = new Scanner(toUnobscure);
                    StringBuilder toUnencrypte =  new StringBuilder();

                    while (scan.hasNext()){

                        String str = scan.nextLine();

                        for (int i = 0; i<str.length(); i++){

                            char replacedValue = (char)(str.charAt(i)-3);
                            toUnencrypte.append(replacedValue);
                        }

                            toUnencrypte.append("\n");
                        }

                    File readable = new File("/Users/malek/Java/readableLovecraft.txt");
                    PrintWriter printer = new PrintWriter(readable);
                    printer.print(toUnencrypte);
                    printer.close();
                    scan.close();



                } catch (FileNotFoundException e) {
                    System.out.println("______________________");
                    System.out.println("This is not an option.");
                    System.out.println("______________________");
                    System.out.println();

                }


            }

            if (selection == 3){
                StringBuilder text = new StringBuilder();
                try{
                    File file = new File("/Users/malek/Java/obscure.txt");
                    Scanner scan = new Scanner(file);

                    while (scan.hasNext()){
                        String str = scan.nextLine();
                        System.out.println(str);
                        text.append(str + "/n");
                    }

                    scan.close();


                } catch (FileNotFoundException e) {
                    System.out.println("______________________");
                    System.out.println("Function not available");;
                    System.out.println("______________________");
                    System.out.println();
                }


            }

            if (selection == 4){
                StringBuilder text = new StringBuilder();
                try{
                    File file = new File("/Users/malek/Java/readableLovecraft.txt");
                    Scanner scan = new Scanner(file);

                    while (scan.hasNext()){
                        String str = scan.nextLine();
                        System.out.println(str);
                        text.append(str + "/n");
                    }

                    scan.close();


                } catch (FileNotFoundException e) {
                    System.out.println("______________________");
                    System.out.println("Function not available");;
                    System.out.println("______________________");
                    System.out.println();
                }


            }
            if (selection==0){
                System.out.println("Bye, bye");
                break;
            }

        }







        //1Read lovecraft and replace each letter with letter 3 ahead.

    }

}
