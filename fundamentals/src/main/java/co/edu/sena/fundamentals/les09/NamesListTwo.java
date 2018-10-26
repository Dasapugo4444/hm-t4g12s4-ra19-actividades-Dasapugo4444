package co.edu.sena.fundamentals.les09;

import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class NamesListTwo {
    public ArrayList listOfNames;
    
    public void setList(){
        listOfNames = new ArrayList();
        listOfNames.add("Santiago Pulido");
        listOfNames.add("David Gómez");
        listOfNames.add("Laura Herrera");
        listOfNames.add("Daniela Cardona");
        System.out.println("Size of ArrayList is: " + listOfNames.size());
    }

    public void displayNames(){
        System.out.println("Nombres: ");
        for (Object name:listOfNames) {
            System.out.println(name);
        }
    }
}
