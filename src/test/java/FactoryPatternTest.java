import FactoryPattern.CarFactory;
import FactoryPattern.Factory;
import elements.product.AbstractProduct;
import elements.product.Car;
import org.junit.Assert;
import org.junit.Test;

/**
 * Class Description
 *
 * @author zoup
 */
public class FactoryPatternTest {

    @Test
    public void testCreate() {
        Factory factory = new CarFactory();
        AbstractProduct product = factory.create();
        Assert.assertEquals(Car.class, product.getClass());
    }


}