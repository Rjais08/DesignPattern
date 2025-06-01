package ThredsInJava.CustomLocks.StampedLock;

import java.util.concurrent.locks.StampedLock;

public class StampedLockMain {

    public static void main(String[] args) {

        StampedLock stampedLock = new StampedLock();
        StampedLockSharedResource resource = new StampedLockSharedResource();

        Thread th1 = new Thread(()->{
            resource.producer(stampedLock);
        });

        Thread th2 = new Thread(()->{
            resource.producer(stampedLock);
        });

        Thread th3 = new Thread(()->{
            resource.consumer(stampedLock);
        });

        th1.start();
        th2.start();
        th3.start();

    }
}
