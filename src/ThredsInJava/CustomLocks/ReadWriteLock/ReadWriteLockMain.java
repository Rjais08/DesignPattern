package ThredsInJava.CustomLocks.ReadWriteLock;

import ThredsInJava.CustomLocks.ReentrantLock.ReentrantLockSharedResource;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLockMain {

    public static void main(String[] args) {

        ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
        ReadWriteLockSharedResource sharedResource = new ReadWriteLockSharedResource();

        Thread th1 = new Thread(() ->{
            sharedResource.producer(readWriteLock);
        });

        Thread th2 = new Thread(() ->{
            sharedResource.producer(readWriteLock);
        });

        Thread th3 = new Thread(() ->{
            sharedResource.consumer(readWriteLock);
        });

        th1.start();
        th2.start();
        th3.start();
    }
}
