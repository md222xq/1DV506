package Test_package;

public class triangle {
    public static void triangle (int size){

        for (int i=0; i<=size;i++){
            for (int s =size; s>i; s--){
                System.out.print(" ");
            }

            for (int j=0; j<i*2-1; j++){
                System.out.print("X");
            }

            System.out.println();
        }

        for (int i = size; i>0; i--){
            for (int s= i-1; s<size;s++ ){
                System.out.print(" ");
            }

            for (int x = 2; x<i*2-1; x++){
                System.out.print("X");
            }


            System.out.println();
        }



    }

    public static void main(String[] args) {
        triangle(5);
    }
}

