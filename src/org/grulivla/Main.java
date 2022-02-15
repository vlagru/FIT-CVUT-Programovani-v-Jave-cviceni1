package org.grulivla;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        // instancni (strany obdelniku) a staticke metody (pocet hranicnich bodu, nebo soucet vbitrnich uhlu)
//        // u staticke metody nemaji smysl instance, ma se volat pres jmeno tridy
//        // System.out.println("Ahoj svete.");
//        // Main.main(null); // v Os bezi JVM, ta pusti Intellij
//        Greeting greetingCZ = new Greeting("Ahoj FITe.");
//        greetingCZ.greet();
//        Greeting greetingCn = new Greeting("你好世界。"); // tvorba noveho objektu // Object, ale nema metodu .greet
//        greetingCn.greet();


        final Scanner scanner = new Scanner(System.in); // ctrl + space, new vola konstruktor, System.in je input stream

        final String userName = System.getProperty("user.name"); // systemova vlastnost
        System.out.println("Ahoj " + userName + ", zadej dve cisla:");

        int x = scanner.nextInt();
        // int x = 3; // ctrl shift alt l - univerzal, scanner lze i do promennych
        int y = scanner.nextInt(); //int y = 4;
        System.out.println(x + " + " + y + " = " + (x + y)); // printf - tam ty procenta jako v C, ozavorkovat
        System.err.println("Chyba"); //5 na error

    }
}
