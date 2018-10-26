package co.edu.sena.fundamentals.les10;

public class OrderTest {

    public static void main(String[] args) {
        Shirt s1=new Shirt();
        Shirt s2=new Shirt();
        Shirt s3=new Shirt();
        Order o1=new Order();
        double totalCost=0.0;

        s1.price=14.99;
        s2.price=23.55;
        s3.price=49.99;
        o1.addShirt(s2);
        o1.addShirt(s3);
        totalCost=o1.addShirt(s3);
        System.out.println("total es: "+totalCost);
    }

}
