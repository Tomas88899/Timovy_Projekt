Znenie zadania
Jedným z často využívaných spôsobov ukladania dát je formát súboru CSV (Comma Separated Values). V rámci CSV súboru sú dáta ukladané v rámci tabuľky (podobne ako napr. v Exceli), jednotlivé hodnoty sú spravidla oddelené čiarkou.

Vašou úlohou je vytvoriť program Filter, ktorý slúži na filtrovanie dát zákazníkov mobilného operátora telekomunikačných služieb. Dáta sú uložene v rámci csv súboru. Jednotlivé výsledky filtrovania budú po aplikovaní filtrov vypísané do konzoly. Na obrazovku budú vypísané všetky informácie o zákazníkoch, úhľadne zobrazené (použite formátovaný výstup - napr. metóda printf()).

O každom zákazníkovi jej potrebné uchovávať nasledovné typy informácií:

- Meno zákazníka

- Kontaktné telefónne číslo (pevné alebo mobilné)

- Mobilná služba (hlas, internet - môže byť jedna, prípadne obe služby súčasne)

- Platba (paušál, kredit)

- Stav účtu (u predplatiteľov musí byť kladný, pri paušáloch je spravidla záporný)

Špecifikácia dát a filtrov
Povedzme, že obsah súboru klienti.csv je nasledovný:

Pišta Novák,0910965236,hlas,internet,pausal,-10

Katka Sladká,0485456985,internet,kredit,70

Jozef Nadaný,0559874563,hlas,kredit,17

Simona Bizíková,0902478123,internet,pausal,-23

Nakoľko sa jedná o konzolovú aplikáciu , program budeme spúšťať z príkazového riadka. Prvý parameter (argument) programu bude názov csv súboru, druhý parameter (argument) bude typ filtra.

Filtre pozostávajú z jedného písmena, nie je možné ich kombinovať a môžu byť nasledovné:

h - vyfiltruje zákazníkov so službou hlas

i - vyfiltruje zákazníkov so službou internet

f - vyfiltruje zákazníkov pre fakturáciu (len klienti so záporným stavom účtu)

m - vyfiltruje zákazníkov, na ktorých máme mobilný kontakt (mobilné telefónne číslo musí začínať 09)