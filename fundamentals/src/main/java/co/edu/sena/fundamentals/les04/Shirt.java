package co.edu.sena.fundamentals.les04;

public class Shirt {

    public char colorCode;
    public String description;
    public double price;
    public int quantityInStock;
    public int shirtId;

    public void displayInformation(){
        System.out.println("Shirt ID: "+ shirtId);
        System.out.println("Shirt description: "+description);
        System.out.println("Shirt price: "+price);
        System.out.println("Shirt color code: "+colorCode);
        System.out.println("Quantity in Stock: "+quantityInStock);
    }

}
