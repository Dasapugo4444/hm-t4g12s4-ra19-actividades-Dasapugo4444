package co.edu.sena.fundamentals.les12;

import java.awt.*;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;

public class Employee implements Printable {

    private String name;
    private String jobTitle;
    private int employeeId;
    private int level;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    private void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public static int employeeIdCounter=0;

    public void calculateEmployeeID(){
        employeeIdCounter++;
        setEmployeeId(employeeIdCounter);
    }


    public void print(){
        System.out.println("nombre: "+getName());
        System.out.println("titulo: "+getJobTitle());
        System.out.println("id: "+getEmployeeId());
        System.out.println("nivel: "+getLevel());
    }

    @Override
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
        return 0;
    }
}
