package U2A4;

public abstract class Tier {
    private int gr;
    private int alter;
    private char geschlecht;


    public Tier(int gr, int alter, char geschlecht){
        this.gr = gr;
        this.alter = alter;
        this.geschlecht = geschlecht;
    }


    public Tier(){

    }

    public void setAlter(int alter){
        this.alter = alter;
    }
    public int getAlter(){
        return this.alter;
    }

    public abstract String spricht();

}
