package co.edu.sena.fundamentals.les07;

public class DateTwo {

    int dayNumber=1;

    public void displayDay(){
        if (dayNumber == 1){
            System.out.println("Lunes");
        }else if (dayNumber==2){
            System.out.println("Martes");
        }else if (dayNumber==3){
            System.out.println("Miércoles");
        }else if (dayNumber==4){
            System.out.println("Jueves");
        }else if (dayNumber==5){
            System.out.println("Viernes");
        }else if (dayNumber==6){
            System.out.println("Sábado");
        }else if (dayNumber==7){
            System.out.println("Domingo");
        }else {
            System.out.println("Número incorrecto");
        }
    }

}
