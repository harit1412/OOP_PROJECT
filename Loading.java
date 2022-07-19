package OOP_PROJECT;

public class Loading extends Thread {

    public void run() {
        // synchronized (this) {
        System.out.println("\nProgram is Collecting the data, it takes some time to complete, please wait..");
        for (int i = 0; i < 20; i++) {
            System.out.print("|");
            try {
                sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public void load() throws InterruptedException {
        Loading t = new Loading();
        t.run();

    }
}
