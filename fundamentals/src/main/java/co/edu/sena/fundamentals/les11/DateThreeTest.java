package co.edu.sena.fundamentals.les11;/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */

public class DateThreeTest {
  public static void main(String args[]){

    DateThree d3=new DateThree();
    d3.setDay(23);
    d3.setMonth(9);
    d3.setYear(1999);

      System.out.println(d3.getDay()+"/"+d3.getMonth()+"/"+d3.getYear());
  } // end main
} // end class
