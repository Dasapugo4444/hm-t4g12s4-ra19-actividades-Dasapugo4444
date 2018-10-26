package co.edu.sena.fundamentals.les06;

public class CustomerTest {

    public static void main(String[] args) {

        Customer cust1=new Customer();
        Customer cust2=new Customer();

        cust1.customerID=1;
        cust1.emailAddress="asd¶@";
        cust1.name="Santiago";

        cust2.name="David";
        cust2.emailAddress="sadasd@";
        cust2.customerID=2;

        cust2=cust1;

        cust1.displayCustomerInfo();
        cust2.displayCustomerInfo();
    }

}
