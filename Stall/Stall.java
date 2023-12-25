package Stall;

public class Stall<T>{

    private T animal;
    public Stall(T animal) {
        this.animal = animal;
    }
    public T getInhalt(){
        return animal;
    }

    public void setInhalt(T animal){
        this.animal = animal;
    }
}