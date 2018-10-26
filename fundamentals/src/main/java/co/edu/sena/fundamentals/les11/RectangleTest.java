package co.edu.sena.fundamentals.les11;/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */

public class RectangleTest {
  public static void main(String args[]){

      Rectangle r1=new Rectangle();
      r1.draw();

      Rectangle r2=new Rectangle(15,5);
      System.out.println("Area: "+r2.getArea());
      r2.draw();

  }// end main
} // end class
