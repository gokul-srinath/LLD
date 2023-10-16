import TicTacToe.TicTacToe;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();

        game.move(0,0,0);
        game.move(1,1,1);
        game.move(0,0,1);
        game.move(1,0,2);
        game.move(0,2,1);
        System.out.println(game.move(1,2,0));

    }
}