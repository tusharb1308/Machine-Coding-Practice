package Chess;

import java.util.Scanner;

public class GameController {
    Board board;
    Player playerWhite;
    Player playerBlack;
    Player currentTurn;


    public GameController(Board board){
        this.board = board;
        playerWhite = new Player(Color.BLACK);
        playerBlack = new Player(Color.WHITE);
        currentTurn = playerWhite;
    }

    public void play(){
        while(!board.isCheckMated(playerWhite) && !board.isCheckMated(playerBlack) &&
        !board.isStalemate(playerBlack) && !board.isStalemate(playerWhite) && !board.isDraw()){
            board.displayChessBoard();
            move(currentTurn);
            switchPlayer();
        }
    }

    private void move(Player currentPlayerTurn){
        if(currentPlayerTurn.playerColor == Color.BLACK){
            System.out.print("Black's turn");
        } else{
            System.out.print("White's turn");
        }


        System.out.print("Enter starting row number: ");
        int startRow = getValidRowInput();
        System.out.print("Enter starting col number: ");
        String startCol = getValidColInput();

        System.out.print("Enter destination row number: ");
        int destRow = getValidRowInput();
        System.out.print("Enter destination col number: ");
        String destCol = getValidColInput();
    }

    private int getValidRowInput(){
        Scanner scanner = new Scanner(System.in);
        int row;
        while (true) {
            if (scanner.hasNextInt()) {
                row = scanner.nextInt();
                if (row > 0 && row < 9) {
                    return row;
                }
            } else {
                scanner.next();
            }
            System.out.print("Invalid input! Please enter a number between 1 and 8.");
        }
    }

    private String getValidColInput(){
        Scanner scanner = new Scanner(System.in);
        String col;
        while (true) {
            if (scanner.hasNext()) {
                col = scanner.next();
                if (col.equals("a") || col.equals("b") || col.equals("c") || col.equals("d") || col.equals("e") || col.equals("f")
                || col.equals("g") || col.equals("h")) {
                    return col;
                }
            } else {
                scanner.next();
            }
            System.out.print("Invalid input! Please enter a character between a and h.");
        }
    }

    private void switchPlayer(){
        currentTurn = currentTurn == playerWhite ? playerBlack : playerWhite;
    }
}
