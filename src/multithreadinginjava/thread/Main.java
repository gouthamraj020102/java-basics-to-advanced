package src.multithreadinginjava.thread;

public class Main {
    public static void main(String[] args) {
        System.out.println("Inside Main method: " + Thread.currentThread().getName());
        MultiThreadingLearningImpl runnableObj = new MultiThreadingLearningImpl();
        Thread thread = new Thread(runnableObj);
        thread.start();
        System.out.println("Finishing Main method: " + Thread.currentThread().getName());

        System.out.println("Inside Main method: " + Thread.currentThread().getName());
        MultiThreadingLearningExt runnableExtObj = new MultiThreadingLearningExt();
        runnableExtObj.start();
        System.out.println("Finishing Main method: " + Thread.currentThread().getName());
    }
}
