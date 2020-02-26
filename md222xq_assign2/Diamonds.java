package md222xq_assign2;
import java.util.Scanner;

public class Diamonds {
    public static void main(String[] args) {

        System.out.print("Plese input a positive integer: ");
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        input.close();

        if (number <= 0){
            System.out.print("Invalid integer.");
        }

        else {      //upper triangle

            int line;
            int space;
            int star;

            for (line=0; line<(number*2)-1; line++){
                if (line<number){
                    for (space=number-line-1; space>0; space--){
                        System.out.print(" ");
                    }

                    for (star=0; star< (2*(line))+1; star ++){
                        System.out.print("*");
                    }

                    System.out.println();

                }




                else {
                    for(space=0; space<line-(number-1); space++){
                        System.out.print(" ");
                    }
                    for (star=(number*2)-1-(2*(line-(number-1))); star>0; star--){
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
        }
    }
}
