package AUD;

public class Laufzeit {

    public static void main(String[] args) {
        int[] a = {5,4,8,5,5,5,456,456,564,654,564,56456,465,8,89,8,84,684,684,68486,48,468,46,84,64,68};

        int n = a.length;
        int i = 0;

        while(i<n){
            System.out.print(a[i]+ " | ");
            i++;
            System.out.println();
            for(int j = 0 ; j<n;j++){
                System.out.print("X");
            }
        }

    }
}
