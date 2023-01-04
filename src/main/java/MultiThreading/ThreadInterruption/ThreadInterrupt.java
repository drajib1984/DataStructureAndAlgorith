package MultiThreading.ThreadInterruption;

public class ThreadInterrupt implements Runnable{
    @Override
    public void run() {
            Thread.currentThread().setName("Child Thread");
            try {
                for (int i = 1; i < 6; i++) {
                    System.out.println(i);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException("Thread is interrupted "+e);
            }
        }

    public static void main(String[] args) {
        ThreadInterrupt threadInterrupt = new ThreadInterrupt();
        Thread thread = new Thread(threadInterrupt);
        thread.start();
        thread.interrupt();
    }
}
