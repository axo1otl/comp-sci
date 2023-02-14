import java.util.Scanner;

public class Game{
    // -[ MAIN ]-

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        func func = new func();

        // board set up
        func.println("Enter board size!");
        func.print("x: ");
        int inx = scan.nextInt();
        func.print("y:");
        int iny = scan.nextInt();

        int[][] board = new int[inx][iny];
        boolean playing = true;
        boolean running = true;
        String move = "";
        int sizeX = board.length;
        int sizeY = board[0].length;
        int newBlocks = (int)(Math.sqrt(sizeX * sizeY) / 3);
        int itr = sizeX;
        String ERROR = "";
        int cnt = 0;

        if (sizeY > sizeX){
            itr = sizeY;
        }

        // program loop
        while (running){

            for (int i = 0; i < board.length; i++){
                for (int k = 0; k < board[0].length; k++){
                    board[i][k] = 0;
                }
            }

            ERROR = ERROR + "\tboard initialized\n";
            
            // start game
            board[func.random(0,sizeX - 1)][func.random(0,sizeY - 1)] = func.random(1,2) * 2;
            board[func.random(0,sizeX - 1)][func.random(0,sizeY - 1)] = func.random(1,2) * 2;

            ERROR = ERROR + "\ttiles placed\n";
            
            // gameplay loop
            while (playing){
                func.printBoard(board);
                
                System.out.println("\n\nQ - quit");
                System.out.print("W/A/S/D: "); // get the next move
                move = scan.next();
                move = move.toUpperCase();

                ERROR = ERROR + "\tmove made: " + move + "\n";
                
                if (move.equals("Q")){
                    ERROR = ERROR + "\tgame quit\n";
                    playing = false;
                    running = false;
                    break;
                }
                
                
                // fall blocks
                for (int i = 0; i < itr; i++){
                    func.fallBlocks(board,move);
                    cnt++;
                }
                ERROR = ERROR + cnt + "x" + ":\tfunc.fallBlocks() ran\n";
                cnt = 0;

                // merge blocks
                func.merge(board,move);
                ERROR = ERROR + "\tfunc.merge() ran\n";
                
                // fall blocks 
                for (int i = 0; i < itr; i++){
                    func.fallBlocks(board,move);
                    cnt++;
                }
                ERROR = ERROR + cnt + "x" + ":\tfunc.fallBlocks() ran\n";
                cnt = 0;
                
                // create new block
                for (int i = 0; i < newBlocks; i++){
                    func.createBlock(board);
                    cnt++;
                }
                ERROR = ERROR + cnt + "x" + ":\tfunc.fallBlocks() ran\n";
                
                // check fail
                playing = !func.fail(board);
                ERROR = ERROR + "\tfunc.fail() ran: " + !playing + "\n";
            }
            
            if (!move.equals("Q")){
                func.println();
                func.println("You lose!");
                func.println("Play again?");
                func.print("y/n: ");
                move = scan.next();

                ERROR = ERROR + "\tplayer quit game\n";
                ERROR = ERROR + "\tplayer selected:" + move + "\n";
            }
            else {
                func.println();
                func.println("Quitting...");
                ERROR = ERROR + "\tprogram quitting...\n";
                break;
            }
            
            if (!move.toUpperCase().equals("Y")){
                playing = false;
                running = false;
            }
        }
        ERROR = ERROR + "\tprogram quit successfully\n";
        func.println(ERROR);
    }
}
