package sk.stuba.fei.uim.oop;


import sk.stuba.fei.uim.oop.game.Tiles.MineRevealedException;

public class Game {

    public Board board;
    public Game()  {
        this.board = new Board();
    }
    public void play() {
        System.out.println(this.board.draw());
    }
}
