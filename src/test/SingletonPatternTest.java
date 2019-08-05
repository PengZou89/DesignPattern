import SingletonPattern.SingletonPattern;
import org.junit.Assert;
import org.junit.Test;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Class Description
 *
 * @author zoup
 */
public class SingletonPatternTest {

    @Test
    public void testEagerSingleton() throws InterruptedException {
        ConcurrentHashMap<SingletonPattern.EagerSingleton, Boolean> set = new ConcurrentHashMap<>();
        AtomicInteger count = new AtomicInteger(0);

        for (int i = 0; i < 100; i++) {
            Thread thread = new Thread(() -> {
                SingletonPattern.EagerSingleton singleton = SingletonPattern.EagerSingleton.getInstance();
                set.put(singleton, true);
                count.addAndGet(1);
            });
            thread.start();
        }

        while (count.get() != 100);
        Assert.assertEquals(1, set.size());

    }


    @Test
    public void testLazySingleton() throws InterruptedException {
        ConcurrentHashMap<SingletonPattern.LazySingleton, Boolean> set = new ConcurrentHashMap<>();
        AtomicInteger count = new AtomicInteger(0);

        for (int i = 0; i < 100; i++) {
            Thread thread = new Thread(() -> {
                SingletonPattern.LazySingleton singleton = SingletonPattern.LazySingleton.getInstance();
                set.put(singleton, true);
                count.addAndGet(1);
            });
            thread.start();
        }

        while (count.get() != 100);
        Assert.assertEquals(1, set.size());

    }

    @Test
    public void testIoDHSingleton() throws InterruptedException {
        ConcurrentHashMap<SingletonPattern.IoDHSingleton, Boolean> set = new ConcurrentHashMap<>();
        AtomicInteger count = new AtomicInteger(0);

        for (int i = 0; i < 100; i++) {
            Thread thread = new Thread(() -> {
                SingletonPattern.IoDHSingleton singleton = SingletonPattern.IoDHSingleton.Holder.getInstance();
                set.put(singleton, true);
                count.addAndGet(1);
            });
            thread.start();
        }

        while (count.get() != 100);
        Assert.assertEquals(1, set.size());

    }


}