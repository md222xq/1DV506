package Test_package;

public class TriangleDiamond {
    public static void rightTriangle (int size) {

        for (int i = 0; i < size; i++) {
            for (int x = 0; x < i; x++) {
                System.out.print("X");

            }
            System.out.println();
        }
    }


    public static void triangle (int size){
        for(int i=0;i<size;i++){

            for(int s=i ;s<size; s++){
                System.out.print(" ");
            }
            for(int x=0; x<i*2-1;x++){
                System.out.print("X");
            }
            System.out.println();
        }
    }

    public static void diamond (int size){
        for(int i=0;i<size;i++){

            for(int s=i ;s<size; s++){
                System.out.print(" ");
            }
            for(int x=0; x<i*2-1;x++){
                System.out.print("X");
            }
            System.out.println();
        }

        for (int i = size; i>=0;i--){
           for(int x = size; x > i  ; x--){
               System.out.print(" ");
           }


            for(int s=0; s<i*2-1; s++){
                System.out.print("X");
            }

            System.out.println();
        }




    }


    public static void main(String[] args) {

        rightTriangle(5);
        triangle(5);
        diamond(5);
    }
}
