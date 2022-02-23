package org.grulivla.seminar2Bliz;


import org.grulivla.seminar2Bliz.entity.MutableNotebook;

import static org.grulivla.seminar2Bliz.entity.NotebookCategory.*; // * importuje to vsechny z enumu

public class BasicExample {

    public static void main(String[] args) {

        MutableNotebook lenovo = new MutableNotebook("Lenovo", BASIC, 20000); // ctrl + p, alt + enter pro import tridy : jedna se o kontextovou napovedu
        MutableNotebook hp = new MutableNotebook("HP", PROFESSIONAL, 30000);
        MutableNotebook dell = new MutableNotebook("Dell XP", GAMING, 35000);

        MutableNotebook[] notebooks = new MutableNotebook[] {lenovo, hp, dell}; // vytvoreni pole notebooku

        for (MutableNotebook notebook : notebooks) {
            System.out.printf("%s %s %d\n", notebook.getName(), notebook.getCategory(), notebook.getPrice());
        }

//        for (int i = 0; i < notebooks.length; i++) {
//            System.out.printf("%s %s %d\n", notebooks[i].getName(), notebooks[i].getCategory(), notebooks[i].getPrice());
//        }
    }

    /*
     ******************************************************************************************************
     * abstrakce : spolecny nadtip od kucky a husy
     * z druhe strany je dedicnost : podtip ziskava vlastnosti z nadtipu
     * polymorfismus : pole zvirat, ptame se na pocet nohou, vrati nam to zvire, objekt vi, jakeho je typu;
     * --- promenna typu animal, pocet nohou se zeptame, dostaneme cislo 4
     * zvire by nemelo mit -1 honu : v ramci setteru lze nastavovat
     * podtridy nemaji pristup k tomu, co je private v nadtride, takze lze pouzit protected, chranene
     * --- proti vsemu vyjma podtrid
     * *****************************************************************************************************
     */

}
