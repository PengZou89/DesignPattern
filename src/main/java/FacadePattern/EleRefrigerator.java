package FacadePattern;

/**
 * Class Description
 *
 * @author zoup
 */
public class EleRefrigerator implements Refrigerator {


    @Override
    public void openDoor() {
        System.out.println("The door opened.");
    }

    @Override
    public void closeDoor() {
        System.out.println("The door closed.");
    }

    @Override
    public void putInto(Elephant elephant) {
        System.out.println("Elephant put into refrigerator.");
    }
}
