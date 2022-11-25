package MultiThreading.ThreadPriority;

public class CheckPriority implements Runnable{

    @Override
    public void run() {
        System.out.println("Currently in run method");
        System.out.println(Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(9);
        System.out.println("The new Thread priority is "+Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
        System.out.println("The new Thread priority is "+Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(Thread.NORM_PRIORITY);
        System.out.println("The new Thread priority is "+Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        System.out.println("The new Thread priority is "+Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {
        CheckPriority checkPriority = new CheckPriority();
        Thread thread = new Thread(checkPriority);
        Thread.currentThread().setName("Rajib in main thread");
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(8);
        System.out.println("Updated priority of main thread is "+Thread.currentThread().getPriority());
        System.out.println(Thread.currentThread().isAlive());
        System.out.println(Thread.currentThread().isDaemon());
        System.out.println("--------");

        thread.start();
        System.out.println(thread.getName());
        thread.setName("In run method");
        System.out.println(thread.getName());
        System.out.println(thread.getPriority());


    }
}
