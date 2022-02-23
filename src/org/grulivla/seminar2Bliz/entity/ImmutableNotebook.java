package org.grulivla.seminar2Bliz.entity;

public class ImmutableNotebook {

    final private String name;
    final private NotebookCategory category;// vyhledavani Stringu neni rychly a zabira dost pameti, alternativa pozit int nejake cislo, enum se pouzije jako datovy typ
    final private int price; // jakmile do promenne neco vlozim, uz to nejde zmenit 'final' a vsechny datove typy m,usi

    public ImmutableNotebook(String name, NotebookCategory category, int price) {
        this.name = name; //this je reference na dany objekt, jakoby jmenoTohoNotebooku
        this.category = category;
        this.price = price;
    }

    // metody getter a setter se mohou jmenovat jakkoli, accessory
    // u immutable se musi vymazat settery!!!
    public String getName() {
        return name;
    }

    public NotebookCategory getCategory() {
        return category;
    }

    public int getPrice() {
        return price;
    }


}
