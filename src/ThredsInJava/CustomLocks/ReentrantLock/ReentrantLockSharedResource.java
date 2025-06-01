package ThredsInJava.CustomLocks.ReentrantLock;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockSharedResource {

    boolean isAvailable = false;

    public void producer(ReentrantLock reentrantLock){
        try{
            reentrantLock.lock();
            System.out.println("Lock acquired by:" + Thread.currentThread().getName());
            Thread.sleep(1000);
            isAvailable = true;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }finally {
            reentrantLock.unlock();
            System.out.println("Lock released by:" + Thread.currentThread().getName());
        }
    }

}
