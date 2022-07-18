package OOP_PROJECT;

public class Loading extends Thread {

    public void run() {
        // synchronized (this) {
        for (int i = 0; i < 10; i++) {
            System.out.print("|");
            try {
                sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // this.notify();
        // }
        // try {
        // wait();
        // } catch (Exception e) {
        // }

    }
}

// public static void start_load()
class start_load {
    public void load() throws InterruptedException {
        Loading t = new Loading();
        t.start();
        // // wait(); q
        // synchronized(t){
        // t.wait();
        // }
        // }

    }
}
