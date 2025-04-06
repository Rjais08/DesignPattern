package ThredsInJava;

public class ThreadClassMain {

    public static void main(String[] args) {
    checkThreadClass();
    }

    public static void checkThreadClass() {

////    part 1.
//        System.out.println("Going Inside Main Method " + Thread.currentThread().getName());
//        ThreadTestPart1 threadTestPart1 = new ThreadTestPart1();
//        Thread thread = new Thread(threadTestPart1);
//        thread.start();
//        System.out.println("Thread executed " + Thread.currentThread().getName());
//
////    Part 2.
//        System.out.println("Going Inside Main Method " + Thread.currentThread().getName());
//        ThreadTest2 threadTest2 = new ThreadTest2();
//        threadTest2.start();
//        System.out.println("Thread executed " + Thread.currentThread().getName());

        // Monitor Lock Example
        MonitorLockExample obj = new MonitorLockExample();
        Thread t1 = new Thread(() -> {
            obj.task1();
        });


        Thread t2 = new Thread(() -> {
            obj.task2();
        });

        Thread t3 = new Thread(() -> {
            obj.task3();
        });

        t1.start();
        t2.start();
        t3.start();
    }
}
