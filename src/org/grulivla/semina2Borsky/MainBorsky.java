package org.grulivla.semina2Borsky;

public class MainBorsky {

    public static void main(String[] args) {

        Rectangular rectangular = new Rectangular(5,4); // implicitni konstruktor bez vytvoreneho konkretniho konstruktoru
        Rectangular rectangular1 = new Rectangular(10);
//        System.out.println("a = " + rectangular.getA() + ", b = " + rectangular.getB());
//        System.out.println("a = " + rectangular1.getA() + ", b = " + rectangular1.getB());
        // DEFAULT_SIZE
        System.out.println(rectangular.toString()); // @Override
        System.out.println(rectangular1.toString());
        // barva pro vsechny geometricke obrazce stejna DRY
        //hluboka a melka kopie : kopie objektu ukazuje na puvodni pole --- melka kopie, vs. hluboka kopie, lze menit i pole
        //immutabilita : vytvoreny objekt je nemenitelny, vse uvnitr jako 'final', na vypocty pouyiti, 'no side effect'
        //--- na stejny input stejny output, nic se nemeni
        //clone() metoda udela hlubokou kopii --- array1.clone()
        //ArrayList<Integer> array = new ArrayList();
        //ArrayList<Integer> array2 = new ArrayList();
        //array = array2; --- toto melka kopie
    }
}
