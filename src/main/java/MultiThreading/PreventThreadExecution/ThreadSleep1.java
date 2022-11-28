package MultiThreading.PreventThreadExecution;

public class ThreadSleep1 implements Runnable{
    @Override
    public void run() {
        try {

            for (int i = 0; i <=10 ; i++) {
                System.out.println(i);
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public static void main(String[] args) {
        ThreadSleep1 threadSleep = new ThreadSleep1();
        Thread thread = new Thread(threadSleep);
        thread.start();
    }
}
