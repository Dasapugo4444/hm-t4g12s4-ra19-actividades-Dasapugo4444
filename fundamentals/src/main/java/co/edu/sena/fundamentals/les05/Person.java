package co.edu.sena.fundamentals.les05;

public class Person {

    public int ageYears=1;
    public int ageDays;
    public long ageMinutes;
    public long ageSeconds;
    public long ageMiliseconds;

    public void calculateAge(){
        ageDays=ageYears*365;
        ageSeconds=ageDays*24*60*60;
        ageMinutes=ageSeconds/60;
        ageMiliseconds=ageSeconds*1000;

        System.out.println("tienes "+ageDays+" dias");
        System.out.println("tienes "+ageMinutes+" dias");
        System.out.println("tienes "+ageSeconds+" dias");
        System.out.println("tienes "+ageMiliseconds+" dias");
    }

}
