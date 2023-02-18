package sk.stuba.fei.uim.oop;


import sk.stuba.fei.uim.oop.game.Tiles.MineRevealedException;
import sk.stuba.fei.uim.oop.utility.ZKlavesnice;

public class Game {

    public Board board;
    public Game()  {
        this.board = new Board();
    }
    public void play() {
        try {
            while (true) {
                System.out.println(this.board.draw());
                this.board.reveal(getNextMove());
            }
        }catch (MineRevealedException e) {
                System.out.println("Mina");
            }
        }



    private Move getNextMove() {

        char row = ZKlavesnice.readChar(String.format("Enter row od (a-%s)%n", (char)('a' + board.VELKOST_POLA - 1)));
        int col = ZKlavesnice.readInt(String.format("Enter colum (0-%d)", board.VELKOST_POLA - 1));
        return new Move(col,row);
    }
}
