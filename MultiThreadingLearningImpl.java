public class MultiThreadingLearningImpl implements Runnable {
    @Override
    public void run() {
        System.out.println("Code executed by thread using implements: " + Thread.currentThread().getName());
    }
}
