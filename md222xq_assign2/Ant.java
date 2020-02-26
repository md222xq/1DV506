package md222xq_assign2;

import java.util.Random;

public class Ant {
    static int[][] gameBoard = new int[8][8];
    public static void main(String[] args) {
        Random random = new Random();

        int[] antMoves = {0,0,0,0,0,0,0,0,0,0};
        int sum = 0;
        for(int i = 0; i < 10; i++){
            //to clear the board
            for(int j = 0; j < 8; j++) {
                for (int k = 0; k < 8; k++) {
                    gameBoard[j][k] = 0;
                }
            }
            //System.out.println("1");
            int AX = random.nextInt(8);
            int AY = random.nextInt(8);
            gameBoard[AX][AY] = 1;


           // System.out.println(2);

            while(!isDone()){
                int rand =random.nextInt(4);
                switch(rand){
                    case 0: AX++;
                            break;
                    case 1: AX--;
                            break;
                    case 2: AY++;
                            break;
                    case 3: AY--;
                            break;
                }

                if(AX < 0)
                    AX = 0;
                else if(AX > 7)
                    AX = 7;
                if(AY < 0)
                    AY = 0;
                else if(AY > 7)
                    AY = 7;
                gameBoard[AX][AY] = 1;
                antMoves[i]++;
            }
            //System.out.println(3);
            System.out.println("The ant went everywhere in "+ antMoves[i]+" moves. Simulation number "+i);
            sum += antMoves[i];
        }
        System.out.println("The average of the ant moves is "+sum/10);

    }
    public static boolean isDone(){
        for(int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (gameBoard[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}

