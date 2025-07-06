public class MultiThreadingLearningExt extends Thread {
    @Override
    public void run() {
        System.out.println("Code executed by thread using extends: " + Thread.currentThread().getName());
    }
}
