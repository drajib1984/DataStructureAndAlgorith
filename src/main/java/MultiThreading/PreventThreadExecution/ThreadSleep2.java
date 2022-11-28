package MultiThreading.PreventThreadExecution;

public class ThreadSleep2 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            try {
                Thread.sleep(2000);
                System.out.println(i+" : "+Thread.currentThread().getName());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        ThreadSleep2 threadSleep2 = new ThreadSleep2();
        Thread thread = new Thread(threadSleep2);
        thread.start();
        thread.setName("First Thread");
        //thread.run(); it will run main thread, no thread is created , so thread1 below will be executed
        //later after main thread is done

        ThreadSleep2 threadSleep21 = new ThreadSleep2();
        Thread thread1 = new Thread(threadSleep21);
        thread1.start();
        thread1.setName("Second Thread");
    }
}
