package co.edu.sena.fundamentals.les10;

public class Customer {

    public int customerID=0;
    public String name="-name required-";
    public String adress="-adress required-";
    public String phoneNuber="-number required-";
    public String email="-email required-";

    public void setCustomerInfo(int Id, String nm, String ad, String phn){
        customerID=Id;
        name=nm;
        adress=ad;
        phoneNuber=phn;

    }

    public void setCustomerInfo(int Id, String nm, String ad, String phn, String em){
        customerID=Id;
        name=nm;
        adress=ad;
        phoneNuber=phn;
        email=em;
    }

    public void displayCustomer(){
        System.out.println("id: "+customerID);
        System.out.println("name "+name);
        System.out.println("address "+adress);
        System.out.println("phone number "+phoneNuber);
        System.out.println("email "+email);
    }
}
