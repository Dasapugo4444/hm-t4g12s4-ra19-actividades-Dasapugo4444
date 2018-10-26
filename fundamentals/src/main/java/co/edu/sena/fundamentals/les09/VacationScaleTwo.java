package co.edu.sena.fundamentals.les09;

import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author administrator
 */
public class VacationScaleTwo {
    public ArrayList vacationDays;
    
    public void setVacationScale(){
        vacationDays = new ArrayList(7);
        vacationDays.add(10);
        vacationDays.add(15);
        vacationDays.add(15);
        vacationDays.add(15);
        vacationDays.add(20);
        vacationDays.add(20);
        vacationDays.add(25);
    }

    public void displayVacationDays(){
        for (int years = 0; years < vacationDays.size(); years++) {
            System.out.println("Las vacaciones para "+ years+" años son: " +
                    vacationDays.get(years));
        }
    }
}
