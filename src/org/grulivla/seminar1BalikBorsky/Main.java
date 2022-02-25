package org.grulivla.seminar1BalikBorsky;

import java.util.Map;
import java.util.Properties;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) { // jmeno tridy ma mit stejne jmeno se souborem

        System.out.println("Hello world!");

        int i = 10;

        // ZAKLADNI KONSTRUKCE

        //wrapper - z dat typu udela objekt
        Integer a = 126;
        Integer b = 126;

        System.out.println(a);
        System.out.println(b);
        System.out.println(a == b); /// false, porovnavat necim jinym, porovnavaji se ukazatele, nad 127 dynamicka alokace, porovnavaji se pointry !!!

        // for (int j = 0; j < ; j++) {} // fori, s C i if, while a jine podobne

        // FUNKCE

        /*

        // Vraci soucet cisel
        public static int myFunction (int param1, int param2) {
            return param1 + param2; // return v tomto pripade klicove slovo
        }

        */

        // KALKULACKA



        /*
        System.out.println(i);
        double a = 10.5;
        System.out.println(a);
        */





















//        // instancni (strany obdelniku) a staticke metody (pocet hranicnich bodu, nebo soucet vbitrnich uhlu)
//        // u staticke metody nemaji smysl instance, ma se volat pres jmeno tridy
//        // System.out.println("Ahoj svete.");
//        // Main.main(null); // v Os bezi JVM, ta pusti Intellij
//        Greeting greetingCZ = new Greeting("Ahoj FITe.");
//        greetingCZ.greet();
//        Greeting greetingCn = new Greeting("你好世界。"); // tvorba noveho objektu // Object, ale nema metodu .greet
//        greetingCn.greet();

        /*
        final Scanner scanner = new Scanner(System.in); // ctrl + space, new vola konstruktor, System.in je input stream

        final String userName = System.getProperty("user.name"); // systemova vlastnost
        System.out.println("Ahoj " + userName + ", zadej dve cisla:");

        Properties properties = System.getProperties(); // map, asociativni pole
        for (Map.Entry<Object, Object>) entry : properties.entrySet(){
            Object entry;
            System.out.println(entry.getkey()) + " " + entry.getValue;
        }

        int x = scanner.nextInt();
        // int x = 3; // ctrl shift alt l - univerzal, scanner lze i do promennych
        int y = scanner.nextInt(); //int y = 4;
        System.out.println(x + " + " + y + " = " + (x + y)); // printf - tam ty procenta jako v C, ozavorkovat
        System.err.println("Chyba"); //5 na error
       */



    }
}
