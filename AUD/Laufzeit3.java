package AUD;

public class Laufzeit3 {


    public static void methode(int[] a){
        for(int i =0 ; i < a.length; i++){
            System.out.print(i + " | ");
        }
    }

    public static void zeige(){
        int[] a = {2,3,4,5,68,6,9,5,2,5};
        methode(a);
    }

    public static void main(String[] args) {
        zeige();
    }
}
