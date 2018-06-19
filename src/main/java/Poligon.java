public class Poligon {
    public static void main(String[] args) {
        System.out.println("Poligon działa");

        int tab[] = new int[5];

        tab[0] = 6;
        tab[1] = 2;
        tab[2] = 4;
        tab[3] = 8;
        tab[4] = 1;

        for (int i = 0; i < 5; i++) {
            System.out.println(tab[i]);
        }

        Poligon p = new Poligon();

        p.className();

    }


    public void className()
    {
        System.out.println("buuuuu");
    }
}
