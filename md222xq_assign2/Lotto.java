package md222xq_assign2;

import java.util.Random;

public class Lotto {
    public static void main(String[] args) {

        Random random = new Random();

        int[] box = new int[7];
        int counter=0;

        while(counter<7){
            int number = random.nextInt(35)+1;
            if (box.length==0){
                box[0]= number;
                counter++;
            }else{
                boolean check=false;
                for(int i=0;i<box.length;i++){
                    if (number == box[i]) {
                        check=true;
                        continue;
                    }
                }
                if(check){
                    continue;
                }
                box[counter] = number;
                counter++;
            }
        }
        System.out.println("The Lotto numbers this week:");
        for(int i =0;i<box.length;i++){
            System.out.print(box[i]+" ");
        }




    }
}
