import AdapterPattern.Adapter;
import BridgePattern.Ink;
import BridgePattern.Pen;
import BridgePattern.Pencil;
import BridgePattern.RedInk;
import org.junit.Test;

/**
 * Class Description
 *
 * @author zoup
 */
public class BridgePatternTest {

    @Test
    public void test() {
        Ink ink = new RedInk();
        Pen pen = new Pencil(ink);
        pen.write();
    }

}