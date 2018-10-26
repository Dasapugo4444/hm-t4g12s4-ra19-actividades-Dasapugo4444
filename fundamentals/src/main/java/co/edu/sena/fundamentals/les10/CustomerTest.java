package co.edu.sena.fundamentals.les10;/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class CustomerTest {
   
  public static void main (String args[]) {

    Customer c1=new Customer();
    Customer c2=new Customer();

    c1.setCustomerInfo(1,"asd","sad12","8647");
    c2.setCustomerInfo(2,"aerf","sasd54","86433","asdds@");

    c1.displayCustomer();
    c2.displayCustomer();
  } 
}
