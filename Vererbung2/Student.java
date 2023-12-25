package Vererbung2;

public class Student extends Person{
    public Student(String name, int alter) {
        super(name, alter);
        //  So nicht ->> this.alter=5;
    }
}
