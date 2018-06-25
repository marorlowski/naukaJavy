package ruszGlowa.prostaGra;

import lombok.Data;

//@Data
public class ProstyPortal {

    int[] polaPolozenia = new int[7];
    int iloscTrafien;


    public String sprawdz(String podanePole) {
        int pole = Integer.parseInt(podanePole);
        String wynik = "";

        for (int i = 0; i < 7; i++) {
            if (polaPolozenia[i] == pole) {

            }
        }

        return wynik;
    }

    ;

    public void setPolaPolozenia(int[] polaPolozenia) {
        this.polaPolozenia = polaPolozenia;
    }
}
