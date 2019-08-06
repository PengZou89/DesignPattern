package AbstractFactoryPattern;

/**
 * Class Description
 *
 * @author zoup
 */
public abstract class AbstractTelevision extends AbstractAppliance {
    @Override
    public void use() {
        System.out.println("Use a television!");
    }
}
