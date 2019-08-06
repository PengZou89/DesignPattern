package BridgePattern;

/**
 * Class Description
 *
 * @author zoup
 */
public class BrushPen extends Pen{
    public BrushPen(Ink ink) {
        super(ink);
    }

    @Override
    public void write() {
        System.out.println("Write with a brush pen" + ink.fill());
    }
}
