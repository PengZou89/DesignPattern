import FactoryPattern.CarFactory;
import FactoryPattern.Factory;
import PrototypePattern.Prototype;
import elements.product.AbstractProduct;
import elements.product.Car;
import org.junit.Assert;
import org.junit.Test;

/**
 * Class Description
 *
 * @author zoup
 */
public class PrototypePatternTest {

    @Test
    public void testClone() throws CloneNotSupportedException {
        Prototype prototype = new Prototype();
        prototype.name = "a";
        prototype.id = 1;

        Prototype prototype1 = prototype.clone();

        Assert.assertEquals(prototype1.name, prototype.name);

    }


}