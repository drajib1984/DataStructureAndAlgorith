package MultiThreading.PreventThreadExecution;

class MedicalTest implements Runnable{

    @Override
    public void run() {
        try {
            System.out.println("Medical started");
            Thread.sleep(3000);
            System.out.println("Medical completed");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class DriveTest implements Runnable{

    @Override
    public void run() {
        try {
            System.out.println("Drive Test started");
            Thread.sleep(5000);
            System.out.println("Drive test completed");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
class OfficerSignature implements Runnable{

    @Override
    public void run() {
        try {
            System.out.println("Going to Officer for approval");
            Thread.sleep(3000);
            System.out.println("Officer has approved driver license");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

public class ThreadJoinLicenseDemo {
    public static void main(String[] args) throws InterruptedException {
        MedicalTest medicalTest = new MedicalTest();
        Thread thread1 = new Thread(medicalTest);
        thread1.start();
        thread1.join();
        Thread.sleep(2000);

        DriveTest driveTest = new DriveTest();
        Thread thread2 = new Thread(driveTest);
        thread2.start();
        thread2.join();
        Thread.sleep(2000);


        OfficerSignature officerSignature = new OfficerSignature();
        Thread thread3 = new Thread(officerSignature);
        thread3.start();

    }
}
