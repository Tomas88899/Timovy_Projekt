
import java.util.ArrayList;
import java.util.List;


public class Filter
{
    public static void main(String[] args)
    {
        /**
         * argumenty pri spusteny ulozene do premmenych
         */
        String nazov = args[0];
        String volba = args[1];

        /**
         * vytbaram list zakaznikov za pomoci anonymneho bezparametrickeho konskruktora
         * na ktory nasledne volam metodu nacitaj kde posuvam spustaci argument
         * nazov suboru v  premmenej nazov
         */

        List<Zakaznik> klient = new NacitajData().nacitaj(nazov);

        /**
        * foeEach cyklus ktory prebehne zoznam zakaznikov z Listu klient
         * a sucasne vyfiltruje zakaznikov podla druheho spustacieho parametru v premmenej volba
        */

        for (Zakaznik zakaznik: klient) {

                if(volba.equalsIgnoreCase("h"))
                    {
                        if(zakaznik.maSluzbuHlas())
                            {
                                System.out.println(zakaznik);
                            }
                    }
                else if(volba.equalsIgnoreCase("i"))
                {
                        if(zakaznik.maSluzbuinternet() )
                        {
                            System.out.println(zakaznik);
                        }
                }
                else if(volba.equalsIgnoreCase("f"))
                {
                    if(zakaznik.getStavUctu() < 0 )
                    {
                        System.out.println(zakaznik);
                    }
                }
                else if(volba.equalsIgnoreCase("m"))
                {
                    if(zakaznik.getKontakt().startsWith("09") )
                    {
                        System.out.println(zakaznik);
                    }
                }
        }




    }
}