package TicTacToe;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player(1, "Player X", Symbol.X);
        Player player2 = new Player(2, "Player O", Symbol.O);

        GameController game = new GameController(player1, player2);

        game.play();
    }
}
