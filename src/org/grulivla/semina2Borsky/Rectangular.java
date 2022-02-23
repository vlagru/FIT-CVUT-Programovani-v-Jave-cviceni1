package org.grulivla.semina2Borsky;

public class Rectangular {

    private int a;
    private int b;

    // overloading konstruktoru
    public Rectangular(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Rectangular(int d) {
        this.a = d;
        this.b = d;
    }


    public static final int DEFAULT_SIZE = 1; // ne vzdy je nutne pouzivat instanci, staticka, nebude se menit

    public Rectangular() {
        this.a = DEFAULT_SIZE;
        this.b = DEFAULT_SIZE;
    }

    //.toString
    @Override
    public String toString() {
        return "Rectangular{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}

