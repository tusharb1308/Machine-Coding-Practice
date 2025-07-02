package TicTacToe;

public class Board {
    private final char[][] grid;
    private int movesCount;

    public Board() {
        grid = new char[3][3];
        movesCount = 0;

        initializeBoard();
    }

    public void initializeBoard(){
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                grid[i][j] = '-';
            }
        }
    }

    public synchronized void makeMove(int row, int col, char symbol){
        if (row < 0 || row >= 3 || col < 0 || col >= 3 || grid[row][col] != '-') {
            throw new IllegalArgumentException("Invalid move!");
        }
        grid[row][col] = symbol;
        movesCount += 1;
    }

    public boolean isGameFinish(){
        return movesCount == 9;
    }

    public boolean gotTheWinner(){
        // Check rows
        for (int row = 0; row < 3; row++) {
            if (grid[row][0] != '-' && grid[row][0] == grid[row][1] && grid[row][1] == grid[row][2]) {
                return true;
            }
        }

        // Check columns
        for (int col = 0; col < 3; col++) {
            if (grid[0][col] != '-' && grid[0][col] == grid[1][col] && grid[1][col] == grid[2][col]) {
                return true;
            }
        }

        // Check diagonals
        if (grid[0][0] != '-' && grid[0][0] == grid[1][1] && grid[1][1] == grid[2][2]) {
            return true;
        }
        return grid[0][2] != '-' && grid[0][2] == grid[1][1] && grid[1][1] == grid[2][0];
    }

    public void displayBoard(){
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print((char) (grid[i][j]) + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

}
