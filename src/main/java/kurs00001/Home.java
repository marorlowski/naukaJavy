package kurs00001;

public class Home {
    public static void main(String[] args) {

//        Outside o = new Outside();
//        o.dodo();
        System.out.println(recursion(10));
        enums();
    }


    public static int recursion(int a) {
        if (a == 0)
            return 1;
        else
            return a * recursion(a - 1);
    }


    public static void enums()
    {
        EnumTest es = EnumTest.XXL;
        System.out.println(es.getSize(es));
    }
}
