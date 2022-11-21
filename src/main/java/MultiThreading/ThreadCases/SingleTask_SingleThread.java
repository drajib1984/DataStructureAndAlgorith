package MultiThreading.ThreadCases;

public class SingleTask_SingleThread implements Runnable{
    @Override
    public void run() {
        System.out.println("Single task executed");
    }

    public static void main(String[] args) {
        SingleTask_SingleThread singleTask_singleThread = new SingleTask_SingleThread();
        Thread thread = new Thread(singleTask_singleThread);
        thread.start();
    }
}
