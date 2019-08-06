package PrototypePattern;

/**
 * Class Description
 *
 * @author zoup
 */
public class Prototype implements Cloneable{
    public Integer id;
    public String name;

    @Override
    public Prototype clone() throws CloneNotSupportedException {
        return (Prototype) super.clone();
    }
}
