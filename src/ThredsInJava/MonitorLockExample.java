package ThredsInJava;

public class MonitorLockExample extends Thread{

    public synchronized void task1(){
        try{
            System.out.println("Inside Task 1");
            Thread.sleep(10000);
            System.out.println("Task 1 Completed");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void task2(){
        try{
            System.out.println("before synchronized Inside Task 2");
            synchronized (this){
                System.out.println("Inside Task 2 Synchronized");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void task3(){
        System.out.println("Inside task 3");
    }
}
