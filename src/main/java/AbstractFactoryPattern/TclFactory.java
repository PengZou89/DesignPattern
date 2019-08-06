package AbstractFactoryPattern;

/**
 * Class Description
 *
 * @author zoup
 */
public class TclFactory implements ApplianceFactory{
    @Override
    public AbstractRefrigerator createRefrigerator() {
        return new TclRefrigerator();
    }

    @Override
    public AbstractTelevision createTelevision() {
        return new TclTelevision();
    }

}
