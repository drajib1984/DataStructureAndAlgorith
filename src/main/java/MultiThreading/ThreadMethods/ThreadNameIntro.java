package MultiThreading.ThreadMethods;

public class ThreadNameIntro {

    public static void main(String[] args) {
        System.out.println("hello");
        System.out.println(Thread.currentThread().getName());

        Thread.currentThread().setName("Rajib in thread");
        System.out.println(Thread.currentThread().getName());
        System.out.println(10/0);// for cheacking the thread name
    }
}
