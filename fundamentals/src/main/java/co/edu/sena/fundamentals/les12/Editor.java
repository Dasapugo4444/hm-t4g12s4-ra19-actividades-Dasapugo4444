package co.edu.sena.fundamentals.les12;

public class Editor extends SkilledEmployee{

    private boolean prefersPaperEditing;

    public void setPrefersPaperEditing(boolean prefersPaperEditing){
        this.prefersPaperEditing=prefersPaperEditing;
    }

    public String getEditingPreference(){
        if (prefersPaperEditing==true){
            return "Paper";
        }else {
            return "Electronic";
        }
    }

    @Override
    public void print() {
        this.getEditingPreference();
        super.print();
        System.out.println("Preferencia de edición: "+this.getEditingPreference());

    }
}
