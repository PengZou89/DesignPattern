package CompositePattern;

/**
 * Class Description
 *
 * @author zoup
 */
public class Branch implements TreeNode{
    @Override
    public void addChild(TreeNode child) {
        System.out.println("Add a child node.");
    }
}
