package co.edu.sena.fundamentals.les06;

public class PersonTwo {

    public StringBuilder name= new StringBuilder(8);
    public StringBuilder phone=new StringBuilder();



    public void displayPersonInfo(){
        name.append("Santiago");
        name.append(" ");
        name.append("Pulido");
        System.out.println("Nombre: "+name.toString());
        System.out.println("Capacidad del objeto nombre: "+name.capacity());

        phone.append(1234567589);
        phone.insert(3,"-");
        phone.insert(7,"-");
        System.out.println("Teléfono: "+phone.toString());

        System.out.println("Primer nombre: "+name.substring(0,8));


    }

}
