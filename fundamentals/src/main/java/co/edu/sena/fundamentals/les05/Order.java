package co.edu.sena.fundamentals.les05;

public class Order {

    public long orderValue=0L;
    public int itemQuantity =10_000_000;
    public int itemPrice=555_500;

    public void calculateTotal(){
        orderValue=(long) itemQuantity*itemPrice;
        System.out.println(orderValue);
    }
}
