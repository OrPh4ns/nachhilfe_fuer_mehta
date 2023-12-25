package AUD;

public class Rek1 {



    public static int summe_it(int a){
        int summe = 0;
        int zahl = a;

        while(zahl>0){
            summe = summe+zahl;
            zahl--;
        }

        return summe;
    }

    public static int summe_rek(int a){

        if(a==0) return 0;

        return summe_rek(a-1)+a;
    }

    public static int fak_rek(int n){
    if(n==1) return 1;

    return fak_rek(n-1)*n;
    }

    public static void main(String[] args) {
        //int[] zahlen = {1,4,3,2};
        System.out.println(summe_it(5) + " Mit Itirativ");
        System.out.println(summe_rek(5)+ " Mit Rekursiv");
        System.out.println(fak_rek(4) + " Mit Rekursiv");
    }
}
