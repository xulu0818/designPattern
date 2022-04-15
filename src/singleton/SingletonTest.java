package singleton;

public class SingletonTest {
    Singleton instance = Singleton.getInstance();

}

/**
 * okay to use, not good
 * will waste memory
 */
class Singleton {
    private Singleton(){

    }

    private static Singleton instance = new Singleton();

    public static Singleton getInstance() {
        return instance;
    }
}

/**
 * not thread safe
 */
class SingletonLazyLoading {
    private SingletonLazyLoading() {

    }

    private static SingletonLazyLoading instance;

    public static SingletonLazyLoading getInstance() {
        if (instance == null) {
            instance = new SingletonLazyLoading();
        }
        return instance;
    }
}

/**
 * thread safe, but waste resource
 */

class SingleThreadSafe {
    private SingleThreadSafe() {

    }
    private static SingleThreadSafe instance;

    public static synchronized SingleThreadSafe getInstance() {
        if (instance == null) {
            instance = new SingleThreadSafe();
        }
        return instance;
    }
}


/**
 * recommend
 */
// Java的volatile关键字能保证变量修改后，对各个线程是可见的。这个听起来有些抽象，下面就详细说明。
// 在一个多线程的应用中，线程在操作非volatile变量时，出于性能考虑，每个线程可能会将变量从主存拷贝到CPU缓存中。
// 如果你的计算机有多个CPU，每个线程可能会在不同的CPU中运行。这意味着，每个线程都有可能会把变量拷贝到各自CPU的缓存中
class SingletonDoubleCheck {
    private SingletonDoubleCheck() {

    }
    private static volatile SingletonDoubleCheck instance;
    public static SingletonDoubleCheck getInstance() {
        if (instance == null) {
            synchronized (SingletonDoubleCheck.class) {
                if (instance == null) {
                    instance = new SingletonDoubleCheck();
                }
            }
        }
        return instance;
    }
}


/**
 * recommend, use JVM class initial thread safe
 * inner static class --> during class load
 */
class SingletonStaticClass {
    private SingletonStaticClass() {

    }

    private static class SingletonInnerStaticClass {
        private static SingletonStaticClass INSTANCE = new SingletonStaticClass();
    }

    public static SingletonStaticClass getInstance() {
        return SingletonInnerStaticClass.INSTANCE;
    }
}




