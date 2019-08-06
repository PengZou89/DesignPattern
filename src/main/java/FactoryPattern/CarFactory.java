package FactoryPattern;

/**
 * Class Description
 *
 * @author zoup
 */
public class CarFactory implements Factory{

    @Override
    public AbstractProduct create() {
        return new Car();
    }

}
