package sk.stuba.fei.uim.oop;

import sk.stuba.fei.uim.oop.game.Tiles.Empty;
import sk.stuba.fei.uim.oop.game.Tiles.Tile;

public class Board {
    final int VELKOST_POLA = 10;

    private Tile[][] board;

    public Board() {
        this.board = new Tile[VELKOST_POLA][VELKOST_POLA];
        naplneniePola();
    }
    private void naplneniePola() {
        for (int i = 0; i <VELKOST_POLA; i++) {
            for (int j = 0; j < VELKOST_POLA; j++) {
                this.board[i][j] = new Empty();
            }
        }
    }
    public String draw() {
        StringBuilder builder = new StringBuilder();
        builder.append("  0123456789\n");
        for (int i = 0; i < VELKOST_POLA; i++) {
            builder.append((char)('a' + i));
            builder.append(" ");
            for (int j = 0; j < VELKOST_POLA; j++) {
                builder.append(this.board[i][j].draw());
            }
            builder.append("\n");




        }
        return builder.toString();

    }

}
