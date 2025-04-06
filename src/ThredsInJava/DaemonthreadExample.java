package ThredsInJava;

public class DaemonthreadExample extends Thread {

    public void run(){
        while(true){
            System.out.println("Daemon");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}

class  ThreadTestDaemon{

    public static void main(String[] args) {

        DaemonthreadExample daemonthreadExample = new DaemonthreadExample();

        daemonthreadExample.setDaemon(true);
        daemonthreadExample.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("main thread running");


    }
}
