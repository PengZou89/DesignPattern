package FactoryPattern;

/**
 * Class Description
 *
 * @author zoup
 */
public class Car extends AbstractProduct{

    @Override
    public void use() {
        System.out.println("Use a car!");
    }
}
