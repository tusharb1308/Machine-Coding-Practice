package Chess.Piece;

import Chess.PieceType;

public abstract class Piece {
    public int id;
    public String color;
    public PieceType type;

    public abstract void move();

    public abstract boolean isMoveValid();
}
