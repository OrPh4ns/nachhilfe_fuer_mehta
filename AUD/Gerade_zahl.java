package AUD;

public class Gerade_zahl {


    public static String gerade(int n){
        if(n==0) return "Gerade";
        if(n==1) return "Ungerade";

        return gerade(n-2);
    }
    public static void main(String[] args) {
        System.out.println(gerade(5));
        System.out.println(gerade(4));
    }
}
