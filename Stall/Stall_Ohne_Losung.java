package Stall;

public class Stall_Ohne_Losung{

    private Object animal;
    public Stall_Ohne_Losung(Object animal) {

        this.animal = animal;
    }
    public Object getInhalt(){
        return animal;
    }
    public void setInhalt(Object animal){
        this.animal = animal;
    }
}