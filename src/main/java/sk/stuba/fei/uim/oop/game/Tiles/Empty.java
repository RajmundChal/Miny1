package sk.stuba.fei.uim.oop.game.Tiles;

public class Empty extends Tile{
    @Override
    protected String drawRevealed() {
        return ".";
    }
}
