package co.edu.sena.fundamentals.les08;

public class GuessingGame {

    public static void main(String[] args) {
        int randomNum=0;
        int guess;

        if (args.length==0 || args[0].compareTo("help")==0){
            System.out.println("Uso: java GuessingGame [argumento]");
            System.out.println();
            System.out.println("Ingresa un número entre 1 y 5");
        }else {
            randomNum=((int)(Math.random()*5)+1);
            guess=Integer.parseInt(args[0]);

            if (guess<1 || guess >5){
                System.out.println("Argumento inválido");
            }else{
                if (guess == randomNum) {
                    System.out.println("Acertaste");
                } else {
                    System.out.println("El número era " + randomNum + " Te equivocaste");
                }
            }
        }
    }
}
