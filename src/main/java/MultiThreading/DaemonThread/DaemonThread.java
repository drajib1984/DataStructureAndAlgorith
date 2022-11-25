package MultiThreading.DaemonThread;

public class DaemonThread implements Runnable {

    @Override
    public void run() {
        System.out.println("Executing daemon task");
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().isDaemon());
        System.out.println(Thread.currentThread().isAlive());
    }

    public static void main(String[] args) {
        System.out.println("In main thread");
        Thread.currentThread().setName("Main thread is called as Rajib Thread ");
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().isAlive());
        DaemonThread daemonThread = new DaemonThread();
        Thread thread = new Thread(daemonThread);
        thread.setDaemon(true);
        System.out.println(thread.isAlive());
        thread.start();
        System.out.println("-----------");
        System.out.println(thread.isAlive());
        thread.setName("Child thread");
        System.out.println("Now moving to run method");
    }
}
