package MultiThreading.PreventThreadExecution;

public class ThreadYield implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <=5; i++) {
            System.out.println(i+" :: "+Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        Thread.yield();
        Thread.currentThread().setName("Main Thread");
        ThreadYield threadYield1 = new ThreadYield();
        Thread thread1 = new Thread(threadYield1);
        thread1.setName("Run thread");
        thread1.start();
        for (int i = 0; i <= 5; i++) {
            System.out.println(i+" :: "+Thread.currentThread().getName());
        }
    }
}
