package co.edu.sena.fundamentals.les12;

import java.util.ArrayList;

public class SkilledEmployee extends Employee {

    private ArrayList<String> skillList=new ArrayList<>();

    public ArrayList getSkills() {
        return skillList;
    }

    public void setSkill(String skill) {
        this.skillList.add(skill);
    }

    @Override
    public void print() {
        Employee skl;
        super.print();
        System.out.println("El empleado tiene las habilidades: ");
        for(String obj:this.skillList){

            System.out.println("\t"+obj);
        }
    }
}
