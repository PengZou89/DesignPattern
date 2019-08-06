import BuilderPattern.Person;
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
public class BuilderPatternTest {

    @Test
    public void testBuild() {
        Person person = new Person.Builder().name("Tom").age(18).build();

        Assert.assertEquals(18, person.getAge());
    }

}