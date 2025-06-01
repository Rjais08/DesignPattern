package ThredsInJava.CustomLocks.StampedLock;

import java.util.concurrent.locks.StampedLock;

public class StampedLockSharedResource {

    int a = 11;

    public void producer(StampedLock stampedLock){
        long stamp = stampedLock.readLock();
        try{
            System.out.println("Lock acquired by:" + Thread.currentThread().getName());
            Thread.sleep(1000);
            a = 10;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }finally {
            stampedLock.unlockRead(stamp);
            System.out.println("Lock released by:" + Thread.currentThread().getName());
        }
    }

    public void consumer(StampedLock stampedLock){
        long stamp = stampedLock.writeLock();
        try {
            System.out.println("Write Lock acquired by:" + Thread.currentThread().getName());
            Thread.sleep(2000);
            a = 9;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }finally {
            stampedLock.unlockWrite(stamp);
            System.out.println("Write Lock released by:" + Thread.currentThread().getName());
        }
    }
}
