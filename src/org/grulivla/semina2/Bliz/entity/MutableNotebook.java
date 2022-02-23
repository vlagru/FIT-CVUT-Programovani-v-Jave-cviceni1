package org.grulivla.semina2.Bliz.entity;

public class MutableNotebook {

    private String name;
    private NotebookCategory category;// vyhledavani Stringu neni rychly a zabira dost pameti, alternativa pozit int nejake cislo, enum se pouzije jako datovy typ
    private int price;

    public MutableNotebook(String name, NotebookCategory category, int price) {
        this.name = name; //this je reference na dany objekt, jakoby jmenoTohoNotebooku
        this.category = category;
        this.price = price;
    }

    // metody getter a setter se mohou jmenovat jakkoli, accessory
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NotebookCategory getCategory() {
        return category;
    }

    public void setCategory(NotebookCategory category) {
        this.category = category;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
