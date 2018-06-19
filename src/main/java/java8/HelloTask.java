package java8;

public class HelloTask implements Runnable {

    @Override
    public void run() {
        for (int i=0; i<1000; i++){
            System.out.println("Witaj świecie");
        }
    }

}
