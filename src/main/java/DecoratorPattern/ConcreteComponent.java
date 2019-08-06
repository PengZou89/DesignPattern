package DecoratorPattern;

/**
 * Class Description
 *
 * @author zoup
 */
public class ConcreteComponent implements Component{
    @Override
    public void doSomething() {
        System.out.println("ConcreteComponent::doSomething");
    }
}
