package TicTacToe;

import java.util.Scanner;

public class GameController {
    private final Board board;
    private final Player playerX;
    private final Player playerY;
    private Player currentPlayer;

    GameController(Player p1, Player p2){
        this.playerX = p1;
        this.playerY = p2;
        this.board = new Board();
        this.currentPlayer = p1;
    }

    public void play(){
        board.displayBoard();
        while(!board.isGameFinish() && !board.gotTheWinner()){
            System.out.println(currentPlayer.getName() + " turn.");
            int row = getValidInput("Enter row (0-2): ");
            int col = getValidInput("Enter col (0-2): ");

            try{
                board.makeMove(row, col, currentPlayer.getSymbol());
                board.displayBoard();
                switchPlayer();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        if(board.gotTheWinner()){
            switchPlayer();
            System.out.println(currentPlayer.getName() + " wins!");
        } else{
            System.out.println("It's a draw!");
        }
    }

    public void switchPlayer(){
        currentPlayer = (currentPlayer == playerX) ? playerY : playerX;
    }

    private int getValidInput(String message){
        Scanner scanner = new Scanner(System.in);
        int input;

        while (true) {
            System.out.print(message);
            if (scanner.hasNextInt()) {
                input = scanner.nextInt();
                if (input >= 0 && input <= 2) {
                    return input;
                }
            } else {
                scanner.next();
            }
            System.out.println("Invalid input! Please enter a number between 0 and 2.");
        }
//        while (true) {
//            System.out.print(message);
//            input = scanner.nextInt();
//            if (input >= 0 && input <= 2) {
//                return input;
//            }
//            System.out.println("Invalid input! Please enter a number between 0 and 2.");
//        }
    }

}
