package org.grulivla.seminar2Bliz;


import org.grulivla.seminar2Bliz.entity.MutableNotebook;
import org.grulivla.seminar2Bliz.entity.NotebookCategory;

//TOTO DODELAT!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

public class ImmutableObjectExample {

    public static void printNotebook(MutableNotebook notebook) { // static nemam instanci tridy
        System.out.printf("%s %s %d\n", notebook.getName(), notebook.getCategory(), notebook.getPrice());

        notebook.setPrice(notebook.getPrice() + 1);


    }

    public static void main(String[] args) {

        MutableNotebook lenovo = new MutableNotebook("Lenovo", NotebookCategory.BASIC, 20000);

        printNotebook(lenovo);
        printNotebook(lenovo);
        printNotebook(lenovo);
        printNotebook(lenovo);
        printNotebook(lenovo);
        printNotebook(lenovo);
    }
}