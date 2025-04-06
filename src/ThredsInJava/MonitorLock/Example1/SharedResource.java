package ThredsInJava.MonitorLock.Example1;

public class SharedResource {

    boolean itemAvailable = false;

    public synchronized void addItem(){
        itemAvailable = true;
        System.out.println("Item added by" + Thread.currentThread().getName());
        notifyAll();
    }

    public synchronized void consumeItem(){

        try{
            if(!itemAvailable){
                System.out.println("Waiting for Resource to be available" + Thread.currentThread().getName());
                wait();
            }

            itemAvailable = false;
            System.out.println("Item Consumed by" + Thread.currentThread().getName());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
