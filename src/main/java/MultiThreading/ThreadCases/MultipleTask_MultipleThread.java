package MultiThreading.ThreadCases;

public class MultipleTask_MultipleThread {
    public static void main(String[] args) {
        VLCVideo video = new VLCVideo();
        Thread thread1 = new Thread(video);
        thread1.start();
        VLCAudio audio = new VLCAudio();
        Thread thread2 = new Thread(audio);
        thread2.start();
        VLCTimer timer = new VLCTimer();
        Thread thread3 = new Thread(timer);
        thread3.start();
        VLCProgressBar progressBar = new VLCProgressBar();
        Thread thread4 = new Thread(progressBar);
        thread4.start();
    }
}

class VLCVideo implements Runnable{
    @Override
    public void run() {
        System.out.println("Playing Video");
    }
}

class VLCAudio implements Runnable{
    @Override
    public void run() {
        System.out.println("Playing Music");
    }
}

class VLCTimer implements Runnable{
    @Override
    public void run() {
        System.out.println("Timer is managing time");
    }
}

class VLCProgressBar implements Runnable{
    @Override
    public void run() {
        System.out.println("Progress bar is checking the video progress");
    }
}
