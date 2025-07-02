package Chess;

import Chess.Piece.Piece;

public class Square {
    public int row;
    public int col;
    public Piece piece;
    public Color color;

    public Square(int row, int col, Color color){
        this.row = row;
        this.col = col;
        this.color = color;
        piece = null;
    }

}