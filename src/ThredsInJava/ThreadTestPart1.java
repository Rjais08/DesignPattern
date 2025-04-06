package ThredsInJava;

// how we can create thread

//we can create thread by using two methods 1. Implementing Runnable interface or Extending 'Thread' class

public class ThreadTestPart1 implements Runnable {


    @Override
    public void run() {
        System.out.println("Thread Started " + Thread.currentThread().getName());
    }

}
