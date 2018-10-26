package co.edu.sena.fundamentals.les12;

import java.util.ArrayList;

public class Manager extends Employee implements Printable {

    private ArrayList employeeList=new ArrayList();

    public void setEmployee(Employee emp){
        employeeList.add(emp);
    }

    public ArrayList getEmployees(){
        return employeeList;
    }

    public void print(){
        Employee emp;
        super.print();
        System.out.println("El manager tiene a los empleados: ");
        for (Object obj: employeeList){
            emp=(Employee)obj;
            System.out.println("\t"+emp.getName());
        }
    }
}
