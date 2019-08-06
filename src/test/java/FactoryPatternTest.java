import FactoryPattern.CarFactory;
import FactoryPattern.Factory;
import FactoryPattern.AbstractProduct;
import FactoryPattern.Car;
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