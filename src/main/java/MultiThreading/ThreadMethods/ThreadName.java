package MultiThreading.ThreadMethods;

public class ThreadName implements Runnable {
    @Override
    public void run() {
        System.out.println("Executing task");
        Thread.currentThread().setName("Rajib in run thread");
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().isAlive());
    }

    public static void main(String[] args) {
        ThreadName threadName1 = new ThreadName();
        Thread thread1= new Thread(threadName1);
        Thread.currentThread().setName("Rajib in main thread");
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().isAlive());
        System.out.println(thread1.isAlive());// is false as the run method is yet to start
        System.out.println("------------------");
        thread1.start();
        System.out.println(thread1.isAlive());// true as the run method is started



    }
}
