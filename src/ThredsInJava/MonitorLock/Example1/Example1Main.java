package ThredsInJava.MonitorLock.Example1;

public class Example1Main {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        Thread producerThread = new Thread(() ->
        {
            try {
                Thread.sleep(30000l);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            sharedResource.addItem();

        });
        Thread consumerThread = new Thread(() -> sharedResource.consumeItem());

        producerThread.start();
        consumerThread.start();
    }
}
