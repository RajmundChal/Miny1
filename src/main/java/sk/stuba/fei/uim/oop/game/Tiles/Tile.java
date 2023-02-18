package sk.stuba.fei.uim.oop.game.Tiles;

public abstract class Tile {

    private boolean relevated;

    public Tile() {
        this.relevated = false;
    }

    public String draw() {
        if (!relevated) {
            return "#";
        }
        return drawRevealed();
    }

    protected abstract String drawRevealed();

    public void reveal()  throws MineRevealedException{
        this.relevated = true;
    }
}
