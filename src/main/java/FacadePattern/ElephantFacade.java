package FacadePattern;

/**
 * Class Description
 *
 * @author zoup
 */
public class ElephantFacade {
    Elephant elephant;
    Refrigerator refrigerator;

    public ElephantFacade(Elephant elephant, Refrigerator refrigerator) {
        this.elephant = elephant;
        this.refrigerator = refrigerator;
    }

    public void putElephantIntoRefrigerator() {
        refrigerator.openDoor();
        refrigerator.putInto(elephant);
        refrigerator.closeDoor();
    }
}
