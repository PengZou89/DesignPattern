package DecoratorPattern;

/**
 * Class Description
 *
 * @author zoup
 */
public class Decorator implements Component{
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void doSomething() {
        component.doSomething();
        System.out.println("do something else.");
    }
}
