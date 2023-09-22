public class Zakaznik
{
    // Meno predstavuje krstne meno nasledovne medzerou a prieazvisko
    private String meno;

    //kontakt predstavuje kontaktne cislo na zakaznika
    private String kontakt;

    // boolen hodnota ci ma zakaznik aktivnu slozbu hlas
    private boolean maSluzbuHlas;
    // boolen hodnota ci ma zakaznik aktivnu slozbu internet
    private boolean maSluzbuinternet;
    // platba predstavuje sposob platy zakaznika
    private String platba;
    // stav uctu zakaznika
    private double stavUctu;

    /**
     * parametricky konstruktor ktory prijmma vsetky udaje o zakaznikovy a mapuje ich na instancne premmene
     * @param meno predstavuje meno a priezvysko zakaznika oddelene medzerou
     * @param kontakt kontakt na zakaznika
     * @param sluzbaHlas boolean hodnota ci ma zakaznik aktivnu sluzbu hlas
     * @param sluzbaInternet boolean hodnota ci ma zakaznik aktivnu sluzbu internet
     * @param platba predstavuje sposob platy zakaznika
     * @param stavUctu stav uctu zakaznika
     */
    public Zakaznik(String meno, String kontakt, String sluzbaHlas,String sluzbaInternet, String platba, double stavUctu) {
        this.meno = meno;
        this.kontakt = kontakt;
        this.maSluzbuHlas = sluzbaHlas.equalsIgnoreCase("hlas");
        this.maSluzbuinternet = sluzbaInternet.equalsIgnoreCase("internet");
        this.platba = platba;
        this.stavUctu = stavUctu;
    }

    /**
     * vracia kontakt na zakaznika
     * @return kontakt na zakaznika
     */
    public String getKontakt() {
        return kontakt;
    }

    /**
     * vracia boolen hodnotu ci ma zakaznik aktivnu sluzu hlas
     * @return boolen hodnotu ci ma zakaznik aktivnu sluzu hlas
     */
    public boolean maSluzbuHlas() {
        return maSluzbuHlas;
    }

    /**
     * vracia boolen hodnotu ci ma zakaznik aktivnu sluzu internet
     * @return boolen hodnotu ci ma zakaznik aktivnu sluzu internet
     */
    public boolean maSluzbuinternet() {
        return maSluzbuinternet;
    }

    /**
     * vracia stav uctu zakaznika
     * @return stav ucutu zakaznika
     */
    public double getStavUctu() {
        return stavUctu;
    }


    /**
     * upravena metoda toString vracia naformatovany objekt zakaznik
     * @return naformatovany objekt zakaznik
     */
    @Override
    public String toString() {
        return String.format("%-16s%12s%10s",meno,kontakt,stavUctu);
    }
}
