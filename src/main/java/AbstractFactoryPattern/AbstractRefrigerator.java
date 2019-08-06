package AbstractFactoryPattern;

/**
 * Class Description
 *
 * @author zoup
 */
public abstract class AbstractRefrigerator extends AbstractAppliance {
    @Override
    public void use() {
        System.out.println("Use a refrigerator!");
    }
}
