package EinSperrenLosung;

class Zwinger2<T>{
// <T> Erzeuge mir einen neuen Datentype
    private T x;

    public void sperreEin(T x)
    {
        this.x = x;
        System.out.println( " Wurde eingespert");
    }
}