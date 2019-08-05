package SingletonPattern;

/**
 * Class Description
 *
 * @author zoup
 */
public class SingletonPattern {

    public static class EagerSingleton {
        private static EagerSingleton instance = new EagerSingleton();

        private EagerSingleton() {}

        public static EagerSingleton getInstance() {
            return instance;
        }

    }

    public static class LazySingleton {
        private static LazySingleton instance = null;

        private LazySingleton() {}

        public static synchronized LazySingleton getInstance() {
            if (instance == null) {
                instance = new LazySingleton();
            }

            return instance;
        }

    }

    public static class IoDHSingleton {
        private IoDHSingleton() {}

        public static class Holder {
            private static IoDHSingleton instance = new IoDHSingleton();

            public static IoDHSingleton getInstance() {
                return instance;
            }
        }

    }

}
