import AbstractFactoryPattern.AbstractRefrigerator;
import AbstractFactoryPattern.ApplianceFactory;
import AbstractFactoryPattern.TclFactory;
import AbstractFactoryPattern.TclRefrigerator;
import org.junit.Assert;
import org.junit.Test;

/**
 * Class Description
 *
 * @author zoup
 */
public class AbstractFactoryPatternTest {

    @Test
    public void testCreateRefrigerator() {
        ApplianceFactory factory = new TclFactory();
        AbstractRefrigerator refrigerator = factory.createRefrigerator();

        Assert.assertEquals(TclRefrigerator.class, refrigerator.getClass());
    }


}