package experiment;

public class MyRunnable implements Runnable {
    public void run() {
        go();
    }

    public void go() {
        try {
            Thread.sleep(2);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        doMore();
    }ad

    public void doMore() {
        System.out.println("top o' the stack");
    }
}////


