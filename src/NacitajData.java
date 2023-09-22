
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class NacitajData
{

    public NacitajData() {
    }

    /**
     * metoda nacita zakaznikov z csv suboru a nasledne vracia List objektov zakaznik
     * @param nazov prijma spustaci parameter nazov suboru
     * @return vracia List objektov zakaznik
     */

    public List<Zakaznik> nacitaj(String nazov) {
    String line = "";

    List<Zakaznik> klient = new ArrayList<>();
    try {


        BufferedReader br = new BufferedReader(new FileReader(nazov));
        while ((line = br.readLine()) != null) {

            String[] attributes = line.split(";");

            Zakaznik zakaznik = vytvorZakaznika(attributes);
            klient.add(zakaznik);

        }
        br.close();
    } catch (IOException e) {
        e.printStackTrace();
    }

    return klient;
}

    /**
     * metoida prijma pole atributov a nasledne ich namapuje na konstruktor triedy zakaznik
     * @param zakaznik prijma pole atributov kazdeho zakaznika
     * @return vracia novy objekt zakaznik
     */
    private Zakaznik vytvorZakaznika(String[] zakaznik)
    {
        String meno = zakaznik[0];
        String kontakt = zakaznik[1];
        String sluzbaHlas = zakaznik[2];
        String sluzbaInternet = zakaznik[3];
        String platba = zakaznik[4];
        double stavUctu = Integer.parseInt(zakaznik[5]);


        return new Zakaznik(meno,kontakt,sluzbaHlas,sluzbaInternet,platba,stavUctu);
    }


}
