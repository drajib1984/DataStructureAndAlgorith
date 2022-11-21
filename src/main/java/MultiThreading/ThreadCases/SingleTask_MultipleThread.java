package MultiThreading.ThreadCases;

public class SingleTask_MultipleThread implements Runnable{
    @Override
    public void run() {
        System.out.println("Printing single task");
    }

    public static void main(String[] args) {
        SingleTask_MultipleThread singleTask_multipleThread1= new SingleTask_MultipleThread();
        Thread thread1 = new Thread(singleTask_multipleThread1);
        thread1.start();

        SingleTask_MultipleThread singleTask_multipleThread2= new SingleTask_MultipleThread();
        Thread thread2 = new Thread(singleTask_multipleThread2);
        thread2.start();


    }
}
