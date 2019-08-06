package FactoryPattern;

import elements.product.AbstractProduct;
import elements.product.Car;

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
