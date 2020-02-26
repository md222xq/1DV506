package Test_package;

public class Trangleandsquare {
    public static void triangle (int size){

        size = size+1;

        for (int i=0; i<size; i++){
            for( int s = i; s<size;s++){
                System.out.print(" ");
            }

            for(int x = 0 ; x < i*2-1; x++){
                System.out.print("X");
            }
            System.out.println();
        }

    }

    public static void square (int size){
        for(int i = 1; i<= size; i++){
            for(int x = 1; x<= size; x++){
                System.out.print("X ");
            }


            System.out.println();
        }



    }








    public static void main(String[] args) {
        triangle(4);
        square(5);
    }




}
