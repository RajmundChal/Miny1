package sk.stuba.fei.uim.oop.game.Tiles;

public class Mine extends Tile {

    @Override
    protected String drawRevealed() {
        return "*";
    }

    @Override
    public void reveal() throws MineRevealedException{
        super.reveal();
        throw new MineRevealedException();
    }

}
