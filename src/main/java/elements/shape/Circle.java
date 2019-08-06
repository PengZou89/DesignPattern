package elements.shape;

/**
 * Class Description
 *
 * @author zoup
 */
public class Circle extends Shape{
    public Circle() {
        type = TYPE.CIRCLE;
    }

    @Override
    public void draw() {
        System.out.println("Draw a circle!");
    }
}
