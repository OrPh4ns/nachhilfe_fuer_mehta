package EinSperrenAufgabe;

class Zwinger2{

    private Hund x;
    // private XO x; man kann XO Interface als Datentype verwenden
    // private XY x; man kann XY Klasse als Datentype verwenden

    /*

   - In dieser Klasse darf man nur Hund einsperren
   - Man darf Tier nicht einsperren, weil Tier abstrakte Klasse ist und nicht als Datentyp verwendet werden darf
     */
    public void sperreEin(Hund x)
    {
        this.x = x;
        System.out.println( "Hund Wurde eingespert");
    }
}
//Warumm Zwinger? --> Das ist eine Klasse die die Tiere zwingt bzw. den Hund einsperren
//Klausurfrage: Zum Beispiel:  In einem Bauernhof kann man in diesem Code nur Hundee einsperren.
// Ändern Sie den Code so, dass man nur Hunde alles einsperren kann!
// Nachdem Sie das gemacht haben, versuchen Sie es in der main-Methode zu erzeugen!
// Was kann man ansatt Hund als Datentyp verweden? --> Interfaces!