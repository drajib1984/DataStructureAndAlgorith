package MultiThreading;

public class ByThreadClass extends Thread {
    @Override
    public void run() {
        System.out.println("Thread class thread started");
    }

    public static void main(String[] args) {
        ByThreadClass threadClass = new ByThreadClass();
        threadClass.start();
    }
}
