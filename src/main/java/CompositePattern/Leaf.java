package CompositePattern;

/**
 * Class Description
 *
 * @author zoup
 */
public class Leaf implements TreeNode {

    @Override
    public void addChild(TreeNode child) {
        throw new UnsupportedOperationException();
    }
}
