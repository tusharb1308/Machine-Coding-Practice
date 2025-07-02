package TicTacToe;

public class Player {
    private final int id;
    private final String name;

    private final Symbol symbol;

    public Player(int id, String name, Symbol symbol) {
        this.id = id;
        this.name = name;
        this.symbol = symbol;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public char getSymbol() {
        return symbol == Symbol.X ? 'X' : 'O';
    }

}
