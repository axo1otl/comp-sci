public class func{
    // -=+ {[ FUNCTIONS ]} +=-

    public int random(int i, int k){
        k++;
        return((int)(Math.random() * (k - (i)) + i));
    }
    
    public void print(){System.out.print("");}
    public void print(int _int){System.out.print(_int);}
    public void print(byte _byte){System.out.print(_byte);}
    public void print(long _long){System.out.print(_long);}
    public void print(char _char){System.out.print(_char);}
    public void print(short _short){System.out.print(_short);}
    public void print(float _float){System.out.print(_float);}
    public void print(double _double){System.out.print(_double);}
    public void print(String _string){System.out.print(_string);}
    public void print(boolean _boolean){System.out.print(_boolean);}
    
    public void println(){System.out.println();}
    public void println(int _int){System.out.println(_int);}
    public void println(byte _byte){System.out.println(_byte);}
    public void println(long _long){System.out.println(_long);}
    public void println(char _char){System.out.println(_char);}
    public void println(short _short){System.out.println(_short);}
    public void println(float _float){System.out.println(_float);}
    public void println(double _double){System.out.println(_double);}
    public void println(String _string){System.out.println(_string);}
    public void println(boolean _boolean){System.out.println(_boolean);}

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
            return;
        }       
        if (move.equals("S")){
            for (int i = board.length - 2; i >= 0; i--){   // down
                for (int k = 0; k < board[0].length; k++){ // across                   
                    if (board[i+1][k] == 0){
                        board[i+1][k] = board[i][k];
                        board[i][k] = 0;
                    }
                }
            }
            return;
        }
        if (move.equals("A")){
            for (int i = 0; i < board.length; i++){        // down
                for (int k = 1; k < board[0].length; k++){ // across
                    if (board[i][k-1] == 0){
                        board[i][k-1] = board[i][k];
                        board[i][k] = 0;
                    }
                }
            }
            return;
        }
        if (move.equals("D")){
            for (int i = 0; i < board.length; i++){   // down
                for (int k = board[0].length - 2; k >= 0; k--){ // across
                    if (board[i][k+1] == 0){
                        board[i][k+1] = board[i][k];
                        board[i][k] = 0;
                    }
                }
            }
            return;
        }
    }

    public void merge(int[][] board, String move){
        if (move.equals("W")){
            for (int i = 1; i < board.length; i++){        // down
                for (int k = 0; k < board[0].length; k++){ // across
                    if (board[i-1][k] == board[i][k]){
                        board[i-1][k] = board[i][k] * 2;
                        board[i][k] = 0;
                    }
                }
            }
            return;
        }
        if (move.equals("S")){
            for (int i = board.length - 2; i >= 0; i--){   // down
                for (int k = 0; k < board[0].length; k++){ // across
                    if (board[i+1][k] == board[i][k]){
                        board[i+1][k] = board[i][k] * 2;
                        board[i][k] = 0;
                    }
                }
            }
            return;
        }
        if (move.equals("A")){
            for (int i = 0; i < board.length; i++){        // down
                for (int k = 1; k < board[0].length; k++){ // across
                    if (board[i][k-1] == board[i][k]){
                        board[i][k-1] = board[i][k] * 2;
                        board[i][k] = 0;
                    }
                }
            }
            return;
        }
        if (move.equals("D")){
            for (int i = 0; i < board.length; i++){   // down
                for (int k = board[0].length - 2; k >= 0; k--){ // across
                    if (board[i][k+1] == board[i][k]){
                        board[i][k+1] = board[i][k] * 2;
                        board[i][k] = 0;
                    }
                }
            }
            return;
        }
    }

    public void createBlock(int[][] board){
        int x = random(0,board.length - 1);
        int y = random(0,board[0].length - 1);
        int val = random(1,2) * 2;
        boolean valid = false;
        
        while(!valid){
            if(board[x][y] == 0){
                board[x][y] = val;
                valid = true;
                //println("Valid");
            }
            else{
                x = random(0,3);
                y = random(0,3);
                //println("Invalid");
            }
        }
    }

    public boolean fail(int[][] board){
        for (int i = 1; i < board.length; i++){        // down
            for (int k = 0; k < board[0].length; k++){ // across
                if (board[i-1][k] == board[i][k]){
                    return(false);
                }
            }
        }
        for (int i = board.length - 2; i >= 0; i--){   // down
            for (int k = 0; k < board[0].length; k++){ // across
                if (board[i+1][k] == board[i][k]){
                    return(false);
                }
            }
        }
        for (int i = 0; i < board.length; i++){        // down
            for (int k = 1; k < board[0].length; k++){ // across
                if (board[i][k-1] == board[i][k]){
                    return(false);
                }
            }
        }
        for (int i = 0; i < board[0].length; i++){   // down
            for (int k = board.length - 2; k >= 0; k--){ // across
                if (board[i][k+1] == board[i][k]){
                    return(false);
                }
            }
        }
        return(true);
    }

    //
    //
    //
}