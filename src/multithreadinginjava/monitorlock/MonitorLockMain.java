package src.multithreadinginjava.monitorlock;

public class MonitorLockMain {
    public static void main(String[] args) {
        MonitorLockExample obj = new MonitorLockExample();

        MonitorThread1Runnable runnableObj = new MonitorThread1Runnable(obj);
        Thread t1 = new Thread(runnableObj);
        Thread t2 = new Thread(() -> {obj.task2();});
        Thread t3 = new Thread(() -> {obj.task3();});

        t1.start();
        t2.start();
        t3.start();
    }
}
