import AdapterPattern.Adapter;
import BuilderPattern.Person;
import org.junit.Assert;
import org.junit.Test;

/**
 * Class Description
 *
 * @author zoup
 */
public class AdapterPatternTest {

    @Test
    public void test() {
        Adapter adapter = new Adapter();
        adapter.someApiOfTarget();
    }

}