package MultiThreading;

public class ByRunnableInterface implements Runnable{
    @Override
    public void run() {
        System.out.println("Runnable class thread started");
    }

    public static void main(String[] args) {
        ByRunnableInterface runnableInterface = new ByRunnableInterface();
        Thread thread = new Thread(runnableInterface);
        thread.start();
    }
}
