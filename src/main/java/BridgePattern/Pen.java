package BridgePattern;

/**
 * Class Description
 *
 * @author zoup
 */
public abstract class Pen {
    Ink ink;

    public void setInk(Ink ink) {
        this.ink = ink;
    }

    public Pen(Ink ink) {
        this.ink = ink;
    }

    public abstract void write();
}
