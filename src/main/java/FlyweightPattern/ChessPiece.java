package FlyweightPattern;

/**
 * Class Description
 *
 * @author zoup
 */
public class ChessPiece {
    public String color;
    public int x;
    public int y;

    public ChessPiece(String color) {
        this.color = color;
    }

    public void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void putdown() {
        System.out.println(color + " Chess Piece put down in (" + x + "," + y + ")");
    }

}
