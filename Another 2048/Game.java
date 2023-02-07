import java.util.Scanner;

public class Game{
    // -[ MAIN ]-

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[][] board = new int[4][4];
        boolean playing = true;
        boolean running = true;
        String move = "";
        func func = new func();

        // program loop
        while (running){

            for (int i = 0; i < board.length; i++){
                for (int k = 0; k < board[0].length; k++){
                    board[i][k] = 0;
                }
            }
            
            // start game
            board[func.random(0,3)][func.random(0,3)] = func.random(1,2) * 2;
            board[func.random(0,3)][func.random(0,3)] = func.random(1,2) * 2;

            /* debugging
            for (int i = 0; i < 50; i++){
                System.out.println(func.random(1,2));
            }
            */
            
            // gameplay loop
            while (playing){
                func.printBoard(board);

                System.out.println("\n\nQ - quit");
                System.out.print("W/A/S/D: "); // get the next move
                move = scan.next();
                
                move = move.toUpperCase();
                
                if (move.equals("Q")){
                    playing = false;
                    running = false;
                }

                // fall blocks
                for(int i = 0; i < 3; i++){
                    func.fallBlocks(board,move);
                }
                // merge blocks

                // fall blocks 
            }
        }
    }
}
