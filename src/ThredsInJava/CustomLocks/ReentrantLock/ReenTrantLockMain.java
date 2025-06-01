package ThredsInJava.CustomLocks.ReentrantLock;

import java.util.concurrent.locks.ReentrantLock;

public class ReenTrantLockMain {

    public static void main(String[] args) {
        ReentrantLock reentrantLock = new ReentrantLock();

        ReentrantLockSharedResource sharedResource = new ReentrantLockSharedResource();
        Thread th1 = new Thread(() ->{
            sharedResource.producer(reentrantLock);
        });

        ReentrantLockSharedResource sharedResource2 = new ReentrantLockSharedResource();
        Thread th2 = new Thread(() ->{
            sharedResource2.producer(reentrantLock);
        });

        th1.start();
        th2.start();
    }
}
