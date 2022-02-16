package org.grulivla;

import java.util.Scanner;

public class Calculator {

    static int sum (int a, int b) {
        return a+b;
    }

    static int substract (int a, int b) {
        return a-b;
    }

    static int modulo (int a, int b) {
        return a%b;
    }

    static  int multiply (int a, int b) {
        return a*b;
    }

    public static void main (String[] args) {
        System.out.println("Zadejte dve cisla");
        Scanner scanner = new Scanner(System.in); // scanner jako dynamicka alokace, system.in ctu ze standartniho vstupu
        int a = scanner.nextInt(); // na vstup prijde int, precti 1. int, ktery prijde na vstup, ten se ulozi
        int b = scanner.nextInt(); // dalsi int, ktery se nacetl, jako scanf %d
        System.out.println("Vyberte jednu z operaci");
        System.out.println("1. + 2. - 3. * 4. %");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1 : {
                System.out.println("Vysledek" + sum(a,b));
                break;
            }
            case 2 : {
                System.out.println("Vysledek" + substract(a,b));
                break;
            }
            case 3 : {
                System.out.println("Vysledek" + modulo(a,b));
                break;
            }
            case 4 : {
                System.out.println("Vysledek" + multiply(a,b));
                break;
            }
            default : {
                System.out.println("Neplatna volba");
            }
        }

    }

}
