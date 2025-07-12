package src.multithreadinginjava.shared;

public class ConsumeTask implements Runnable {

    SharedResource sharedResource;

    ConsumeTask(SharedResource resource) {
        this.sharedResource = resource;
    }

    @Override
    public void run() {
        System.out.println("Consumer thread: " + Thread.currentThread().getName());
        sharedResource.consumeItem();
    }
}
