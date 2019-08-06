package BridgePattern;

/**
 * Class Description
 *
 * @author zoup
 */
public class Pencil extends Pen{
    public Pencil(Ink ink) {
        super(ink);
    }

    @Override
    public void write() {
        System.out.println("Write with a pencil " + ink.fill());
    }
}
