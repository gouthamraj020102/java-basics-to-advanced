package src.multithreadinginjava.shared;

public class MainUsingLamdaexpn {
    public static void main(String[] args) {
        System.out.println("Main method start");

        SharedResource sharedResource = new SharedResource();

        // producer thread
        Thread producerThread = new Thread(() -> {
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
                // exception handling here
            }
            System.out.println("Producer Thread: " + Thread.currentThread().getName());
            sharedResource.addItem();
        });

        Thread consumerThread = new Thread(() -> {
            System.out.println("Consumer Thread: " + Thread.currentThread().getName());
            sharedResource.consumeItem();
        });

        // thread is in "RUNNABLE state"
        producerThread.start();
        consumerThread.start();

        System.out.println("Main method end!");
    }
}
