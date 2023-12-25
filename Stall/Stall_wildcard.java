package Stall;

public class Stall_wildcard<T extends Tier>{

    private T animal;
    public Stall_wildcard(T animal) {
        this.animal = animal;
    }
    public T getInhalt(){
        return animal;
    }

    public void setInhalt(T animal){
        this.animal = animal;
    }
}