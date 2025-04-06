package ThredsInJava.MonitorLock.Example2;

public class MonitorLockProducerConsumerMain {

    public static void main(String[] args) {

        SharedResourceQueue sharedResourceQueue = new SharedResourceQueue(4);

        Thread producerThread = new Thread( () -> {
            try {
                for(int i= 1; i<=8; i++){
                    sharedResourceQueue.produceItem(i);
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });

        Thread consumerThread = new Thread( () -> {
            try {
                for(int i= 1; i<=8; i++){
                    sharedResourceQueue.consumeItem();
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });

        producerThread.start();
        consumerThread.start();
    }
}
