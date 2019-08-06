import FacadePattern.EleRefrigerator;
import FacadePattern.Elephant;
import FacadePattern.ElephantFacade;
import org.junit.Test;

/**
 * Class Description
 *
 * @author zoup
 */
public class FacadePatternTest {

    @Test
    public void test() {
        ElephantFacade facade = new ElephantFacade(new Elephant(), new EleRefrigerator());
        facade.putElephantIntoRefrigerator();
    }
}
