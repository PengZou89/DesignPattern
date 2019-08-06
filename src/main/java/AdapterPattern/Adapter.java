package AdapterPattern;

/**
 * Class Description
 *
 * @author zoup
 */
public class Adapter extends Adaptee implements Target{
    Adaptee adaptee = new Adaptee();

    @Override
    public void someApiOfTarget() {
        adaptee.someApiOfAdatptee();
    }
}
