package ruszGlowa.prostaGra;

import lombok.Data;

//@Data
public class ProstyPortal {

    int[] polaPolozenia;
    int iloscTrafien=1;


    public String sprawdz(String podanePole) {
        int strzal = Integer.parseInt(podanePole);
        String wynik = "pudło";

        for (int pole : polaPolozenia) {
            if (strzal == pole) {
                wynik = "trafiony";
                iloscTrafien++;
                break;
            }
        }

        if (iloscTrafien==polaPolozenia.length){
            wynik ="zatopiony";
        }

        System.out.println(wynik);
        return wynik;
    }

    public void setPolaPolozenia(int[] polaPolozenia) {
        this.polaPolozenia = polaPolozenia;
    }
}
