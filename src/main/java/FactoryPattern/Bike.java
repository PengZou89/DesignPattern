package FactoryPattern;

/**
 * Class Description
 *
 * @author zoup
 */
public class Bike extends AbstractProduct{
    @Override
    public void use() {
        System.out.println("Use a bike!");
    }
}
