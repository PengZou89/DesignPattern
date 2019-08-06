package SingletonPattern;

/**
 * Class Description
 *
 * @author zoup
 */
public class IoDHSingleton {
    private IoDHSingleton() {}

    public static class Holder {
        private static IoDHSingleton instance = new IoDHSingleton();

        public static IoDHSingleton getInstance() {
            return instance;
        }
    }

}
