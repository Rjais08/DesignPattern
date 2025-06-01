package ThredsInJava.CustomLocks.ReadWriteLock;

import java.util.concurrent.locks.ReadWriteLock;

public class ReadWriteLockSharedResource {

    boolean isAvailable = false;

    public void producer(ReadWriteLock readWriteLock){
        try {
            readWriteLock.readLock().lock();
            System.out.println("Lock aquired by:" + Thread.currentThread().getName());
            Thread.sleep(1000);
            isAvailable = true;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }finally {
            readWriteLock.readLock().unlock();
            System.out.println("Lock released by:" + Thread.currentThread().getName());
        }
    }

    public void consumer(ReadWriteLock readWriteLock){
        try {
            readWriteLock.writeLock().lock();
            System.out.println("Lock aquired in consumer by:" + Thread.currentThread().getName());
            Thread.sleep(4000);
            isAvailable = false;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }finally {
            readWriteLock.writeLock().unlock();
            System.out.println("Lock released by:" + Thread.currentThread().getName());
        }
    }
}
