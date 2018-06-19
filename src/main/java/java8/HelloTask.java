package java8;

import java8.Interface.InterfaceTest;

public class HelloTask implements Runnable, InterfaceTest {

    @Override
    public void run() {
        for (int i=0; i<1000; i++){
            System.out.println("Witaj świecie");
        }
    }

    @Override
    public String name() {
        return null;
    }
}
