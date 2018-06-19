package kurs00003;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
//        Main3 m = new Main3();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz cyfrę");
//
//        try {
//            int i = scanner.nextInt();
//        }catch (Exception e)
//        {
//            System.err.println("Nie wprowadziłeś cyfry, wyjatek: "+e);
//        }

        System.out.println(division(5));
    }

    public static double division(int a) {
        Scanner scanner = new Scanner(System.in);

        try {
            return a / scanner.nextInt();
        } catch (Exception e) {
            return 0;
        }

    }

}
