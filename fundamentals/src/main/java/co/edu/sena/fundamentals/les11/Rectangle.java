package co.edu.sena.fundamentals.les11;

public class Rectangle {

    private int width;
    private int height;

    public Rectangle() {
        this.height = 10;
        this.width = 25;
        System.out.println("Rectangulo por defecto creado: alto=10, ancho 25");
    }

    public Rectangle(int w, int h) {
        if (w > 0 && w < 30 && h > 0 && h < 30) {
            width = w;
            height = h;
            System.out.println("Rectangulo creado: ancho: " + width + ", alto: " + height);
        } else {
            System.out.println("Inválidos parámetros, deben ser positivos y menores a 30");
        }
    }

    public int getArea() {
        return width * height;
    }

    public void draw() {
        for (int rowCounter = 0; rowCounter < height; rowCounter++) {
            for (int colCounter = 0; colCounter < width; colCounter++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}