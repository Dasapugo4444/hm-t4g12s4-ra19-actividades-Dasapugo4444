package co.edu.sena.fundamentals.les09;

public class ClassMap {

    public String[][] deskArray;
    public String name;

    public void setClassMap(){
        deskArray=new String[3][4];
    }

    public void setDesk(){
        boolean flag=false;
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 4; col++) {
                if (deskArray[row][col]==null) {
                    deskArray[row][col] = name;
                    System.out.println
                       (name+" está ubicado en el escritorio: "+row+", "+col);
                    flag=true;
                    break;
                }
            }
            if (flag==true){
                break;
            }
        }
        if (flag==false){
            System.out.println("Todos los escritorios están ocupados");
        }
    }

    public void displayDeskMap(){
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 4; col++) {
                System.out.print(" "+deskArray[row][col]+" ");
            }
            System.out.println();
        }
    }

    public void searchDesk(){
        boolean flag=false;
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 4; col++) {
                    if (deskArray[row][col]!=null && deskArray[row][col].equals(name)){
                    System.out.println(name+" está en: "+row+" "+col);
                    flag=true;
                    break;
                    }
                }
                if (flag==true){
                    break;
            }

        }
        if (flag==false){
            System.out.println(name + " No encontrado");
        }
    }
}
