import CompositePattern.Branch;
import CompositePattern.Leaf;
import CompositePattern.TreeNode;
import org.junit.Test;

/**
 * Class Description
 *
 * @author zoup
 */
public class CompositePatternTest {

    @Test(expected = UnsupportedOperationException.class)
    public void test() {
        TreeNode branch = new Branch();
        TreeNode leaf = new Leaf();

        branch.addChild(leaf);
        leaf.addChild(branch);

    }

}
