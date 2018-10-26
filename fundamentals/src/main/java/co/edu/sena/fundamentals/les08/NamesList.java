package co.edu.sena.fundamentals.les08;

import java.util.ArrayList;

public class NamesList {

    public ArrayList listOfNames;

    public void setList(){
        listOfNames=new ArrayList();
        listOfNames.add("Santiago Pulido");
        listOfNames.add("David Gómez");
        listOfNames.add("Laura Herrera");
        listOfNames.add("Daniela Cardona");

        System.out.println("Lista: "+listOfNames);
        System.out.println("Tamaño: "+listOfNames.size());

        listOfNames.remove("David Gómez");
        System.out.println("Lista: "+listOfNames);
        listOfNames.add(3,"David Gómez");
        System.out.println("Lista: "+listOfNames);
        System.out.println("Tamaño: "+listOfNames.size());
    }


}
