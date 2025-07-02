package Chess.Piece;

import Chess.Color;
import Chess.Piece.Piece;

public class Bishop extends Piece {
    public String id;
    public Color color;

    public Bishop(String id, Color color){
        this.id = id;
        this.color = color;
    }
    @Override
    public void move() {

    }

    @Override
    public boolean isMoveValid() {
        return true;
    }
}
