package Vererbung2;

public abstract class Person {
    String name;
    int alter;
    final String art = "Person";

    public Person(String name, int alter)
    {
     this.alter= alter;
     this.name=name;
    }

    public void setName(String name){
        this.name=name;
    }
    public void setAlter(int alter)
    {
        this.alter=alter;
    }

    public String getName(){
        return this.name;
    }

    public int getAlter(){
        return this.alter;
    }

}
