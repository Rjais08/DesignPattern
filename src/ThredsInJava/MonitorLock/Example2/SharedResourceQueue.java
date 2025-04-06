package ThredsInJava.MonitorLock.Example2;

import java.util.LinkedList;
import java.util.Queue;

public class SharedResourceQueue {

    private Queue<Integer> sharedBuffer;
    private int bufferSize;

    public SharedResourceQueue( int bufferSize){
        sharedBuffer = new LinkedList<>();
        this.bufferSize = bufferSize;
    }
    public synchronized void produceItem(int item) throws Exception{

        while(bufferSize == sharedBuffer.size()){
            System.out.println("Queue is Currently full");
            wait();
        }

        sharedBuffer.add(item);
        System.out.println("Item Added by Producer " + Thread.currentThread().getName() + " Size " + sharedBuffer.size());
        notifyAll();
    }

    public synchronized int consumeItem() throws Exception{
        while(sharedBuffer.isEmpty()){
            System.out.println("Consumer is Waiting for Producer");
            wait();
        }
        int item = sharedBuffer.poll();
        System.out.println("Item Consumed by Consumer " + Thread.currentThread().getName() + " Size " + sharedBuffer.size());
        notifyAll();
        return item;

    }
}
