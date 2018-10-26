package co.edu.sena.fundamentals.les09;

public class Sequence {

    public int firstNumber=0;
    public int secondNumber=1;
    public int nextNumber;
    public final int SEQUENCE_LIMIT=100;

    public void displaySequence(){
        System.out.println(firstNumber);
        System.out.println(secondNumber);
        nextNumber=firstNumber+secondNumber;
        while (nextNumber<=SEQUENCE_LIMIT){
            System.out.println(nextNumber+" ");
            firstNumber=secondNumber;
            secondNumber=nextNumber;
            nextNumber=firstNumber+secondNumber;
        }
        System.out.println(" ");

    }

}
