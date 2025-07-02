package Chess;

import Chess.Piece.*;

public class Board {
    private final Square[][] chessBoard;

    Board(){
        chessBoard = new Square[8][8];
        initializeBoard();
    }

    public void initializeBoard(){
        int index = 0;
        for(int col=0; col<8; col++){
            for(int row=0; row<8; row++){
                chessBoard[row][col] = new Square(row, col, index == 0 ? Color.BLACK : Color.WHITE);
                Square s = chessBoard[row][col];
                if(row == 0){
                    if(col == 0){
                        s.piece = new Rook("WR1", Color.WHITE);
                    } else if(col == 7){
                        s.piece = new Rook("WR2", Color.WHITE);
                    } else if(col == 1){
                        s.piece = new Knight("WK1", Color.WHITE);
                    } else if(col == 6){
                        s.piece = new Knight("WK2", Color.WHITE);
                    } else if(col == 2){
                        s.piece = new Bishop("WB1", Color.WHITE);
                    } else if(col == 5){
                        s.piece = new Bishop("WB2", Color.WHITE);
                    } else if(col == 3){
                        s.piece = new Queen("WQ", Color.WHITE);
                    } else{
                        s.piece = new King("WK", Color.WHITE);
                    }
                }
                else if(row == 7){
                    if(col == 0){
                        s.piece = new Rook("BR1", Color.BLACK);
                    } else if(col == 7){
                        s.piece = new Rook("BR2", Color.BLACK);
                    } else if(col == 1){
                        s.piece = new Knight("BK1", Color.BLACK);
                    } else if(col == 6){
                        s.piece = new Knight("BK2", Color.BLACK);
                    } else if(col == 2){
                        s.piece = new Bishop("BB1", Color.BLACK);
                    } else if(col == 5){
                        s.piece = new Bishop("BB2", Color.BLACK);
                    } else if(col == 3){
                        s.piece = new Queen("BQ", Color.BLACK);
                    } else{
                        s.piece = new King("BK", Color.BLACK);
                    }
                }
                else if(row == 1 || row == 6) {
                    Piece pawn;
                    if(row == 1){
                        pawn = new Pawn("W" + (char) (col + 1), Color.WHITE);
                    } else{
                        pawn = new Pawn("B" + (char) (col + 1), Color.BLACK);
                    }
                    s.piece = pawn;
                }

                if(row < 7) index = index ^ 1;
            }
        }
    }

    public boolean isMoveValid(){
        return true;
    }

    public boolean isCheckMated(Player player){
        return true;
    }

    public boolean isStalemate(Player player){
        return true;
    }

    public boolean isDraw(){
        return true;
    }

    public void displayChessBoard(){

    }

}