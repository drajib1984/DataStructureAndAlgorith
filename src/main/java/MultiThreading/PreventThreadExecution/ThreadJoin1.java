package MultiThreading.PreventThreadExecution;

public class ThreadJoin1 implements Runnable{
    @Override
    public void run() {


        try {
            for (int i = 0; i <= 5; i++) {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName()+" : "+i);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public static void main(String[] args) throws InterruptedException {
        ThreadJoin1 threadJoin = new ThreadJoin1();
        Thread.currentThread().setName("Main Thread");
        String threadName = Thread.currentThread().getName();
        Thread thread = new Thread(threadJoin);
        thread.start();
        thread.setName("Child Thread");
        thread.join();
        Thread.sleep(5000);
        for (int i = 0; i <=5 ; i++) {
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName()+" : "+i);
        }
    }
}
