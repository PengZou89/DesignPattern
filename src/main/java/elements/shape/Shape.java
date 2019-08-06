package elements.shape;

/**
 * Class Description
 *
 * @author zoup
 */
public abstract class Shape {
    public enum TYPE {CIRCLE, RECTANGLE, SQUARE};

    public TYPE type;

    public abstract void draw();
}
