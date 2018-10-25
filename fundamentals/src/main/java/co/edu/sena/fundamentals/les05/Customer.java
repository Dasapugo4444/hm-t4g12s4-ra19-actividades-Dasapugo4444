package co.edu.sena.fundamentals.les05;

public class Customer {

    public int customerId=1;      //La id
    public char status;     //el status
    public double totalPurchase=0.0;    //el total

    public void displayCustomerInfo(){
        System.out.println("id: "+customerId);
        System.out.println("status: "+status);
        System.out.println("Total: "+totalPurchase);
    }

}
