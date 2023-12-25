package Vererbung3UndSchnittstelle;

public abstract class Tier {
    private String farbe;
    private int alter;

    public Tier(String farbe, int alter){
        this.alter = alter;
        this.farbe=farbe;
    }
    public Tier(){}
    

    public void WasBinIch()
    {
        System.out.println("Ich bin ein Tier");
    }

    public void WelcheFarbe()
    {
        System.out.println("Meine Farbe ist "+this.farbe);
    }

    public abstract void was(); // bei einer abstrakten Methode in einer abstraken Klasse muss man abstract schreiben


}
