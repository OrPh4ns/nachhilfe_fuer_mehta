package AutoWaschen;

public class AutoWaschen<O extends Auto>{

    private O auto;

    public AutoWaschen(O auto){
        this.auto = auto;
    }

    public O zeigeAuto(){
        return this.auto;
    }
}