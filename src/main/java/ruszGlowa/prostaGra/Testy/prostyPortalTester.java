package ruszGlowa.prostaGra.Testy;

import ruszGlowa.prostaGra.ProstyPortal;

public class prostyPortalTester {
    public static void main (String[] args)
    {
        ProstyPortal wit = new ProstyPortal();
        int[] polozenia = {2,3,4};

        wit.setPolaPolozenia(polozenia);

        String wybranePole = "2";

        String wynik = wit.sprawdz(wybranePole);

        String wynikTestu = "Niepowodzenie";

        if(wynik.equals("trafiony")){
            wynikTestu="zakończony pomyślnie";
        }
        System.out.println(wynikTestu);
    }
}
