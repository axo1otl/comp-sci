public class func{
    // -=+ {[ FUNCTIONS ]} +=-

    public int random(int i, int k){
        k++;
        return((int)(Math.random() * (k - (i)) + i));
    }

    public void printBoard(int[][] board){

        for (int i = 0; i < board.length; i++){
            System.out.println("");
            System.out.println("");
            System.out.println("");

            for (int k = 0; k < board[0].length; k++){
                if (board[i][k] == 0){
                    System.out.print(".\t");
                }
                else{
                    System.out.print(board[i][k] + "\t");
                }
            }
        }
    }

    public void fallBlocks(int[][] board, String move){

        if (move.equals("W")){
            for (int i = 1; i < board.length; i++){        // down
                for (int k = 0; k < board[0].length; k++){ // across

                    if (board[i-1][k] == 0){
                        board[i-1][k] = board[i][k];
                        board[i][k] = 0;
                    }


                }
            }
        }

        if (move.equals("S")){
            for (int i = board.length - 2; i >= 0; i--){   // down
                for (int k = 0; k < board[0].length; k++){ // across
                    System.out.println(board[i][k]);

                    if (board[i+1][k] == 0){
                        board[i+1][k] = board[i][k];
                        board[i][k] = 0;
                    }


                }
            }
        }

        if (move.equals("S")){
            for (int i = board.length - 2; i >= 0; i--){   // down
                for (int k = 0; k < board[0].length; k++){ // across
                    System.out.println(board[i][k]);

                    if (board[i+1][k] == 0){
                        board[i+1][k] = board[i][k];
                        board[i][k] = 0;
                    }


                }
            }
        }


    }

    //
    //
    //
}