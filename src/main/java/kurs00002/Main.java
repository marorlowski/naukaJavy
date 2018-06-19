package kurs00002;

import java.math.BigInteger;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Main s = new Main();
        s.addingString();
        s.showString();
        s.showMath();
        s.showRandom();
    }

    public void addingString()
    {
        StringBuilder stringBuilder = new StringBuilder();

        String str = "a";
        stringBuilder.append(str);

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            stringBuilder.append("a");
        }
        str = stringBuilder.toString();
        long endTime = System.currentTimeMillis();
        long result = endTime - startTime;
        System.out.println(result);
    }

    public void showString()
    {
        String str = "temporary text";
        str = str.charAt(0) + "";
        System.out.println(str);
    }

    public void showMath()
    {
        int a = 90;
        a = Math.abs(a);
        double b = Math.pow(a, 2);
        System.out.println(a+" "+b);
        BigInteger bigInteger = new BigInteger("12312312312313213123123123123");
        BigInteger bigInteger2 = new BigInteger("12312312312313213123123123123");

        System.out.println(bigInteger.add(bigInteger2));
    }

    public void showRandom()
    {
        Random rand = new Random();
        int a = rand.nextInt(100);
        System.out.println(a);

        for (int i =0; i <100; i++)
        {
            int x = rand.nextInt(10)+1;
            int y = rand.nextInt(10)+1;

            System.out.println(x +" * "+y+" = "+x*y);
        }

    }
}
