package org.grulivla.semina2.Bliz;


import org.grulivla.semina2.Bliz.entity.MutableNotebook;

import static org.grulivla.semina2.Bliz.entity.NotebookCategory.BASIC;

//TOTO DODELAT!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

public class ImmutableObjectExample {

    public static void printNotebook(MutableNotebook notebook) { // static nemam instanci tridy
        System.out.printf("%s %s %d\n", notebook.getName(), notebook.getCategory(), notebook.getPrice());

        notebook.setPrice(notebook.getPrice() + 1);


    }

    public static void main(String[] args) {

        MutableNotebook lenovo = new MutableNotebook("Lenovo", BASIC, 20000);

        printNotebook(lenovo);
        printNotebook(lenovo);
        printNotebook(lenovo);
        printNotebook(lenovo);
        printNotebook(lenovo);
        printNotebook(lenovo);
    }
}