import BridgePattern.Ink;
import BridgePattern.Pen;
import BridgePattern.Pencil;
import BridgePattern.RedInk;
import DecoratorPattern.ConcreteComponent;
import DecoratorPattern.Decorator;
import org.junit.Test;

/**
 * Class Description
 *
 * @author zoup
 */
public class DecoratorPatternTest {

    @Test
    public void test() {
        Decorator decorator = new Decorator(new ConcreteComponent());
        decorator.doSomething();
    }

}