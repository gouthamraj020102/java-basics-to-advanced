package src.multithreadinginjava.shared;

public class ProduceTask implements Runnable {

    SharedResource sharedResource;

    ProduceTask(SharedResource resource) {
        this.sharedResource = resource;
    }

    @Override
    public void run() {
        System.out.println("Produced thread: " + Thread.currentThread().getName());
        try {
            Thread.sleep(5000l);
        } catch (Exception e) {
            // handle any exception here
        }
        sharedResource.addItem();
    }
}
