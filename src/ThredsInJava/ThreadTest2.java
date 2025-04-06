package ThredsInJava;

public class ThreadTest2 extends Thread{


    @Override
    public void run(){
        System.out.println("Thread Started " + Thread.currentThread().getName());
    }


}
