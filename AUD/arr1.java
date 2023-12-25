package AUD;

import java.util.ArrayList;

public class arr1 {

    public static void main(String[] args) {
        int[] a = new int[5];

        System.out.println(a.length);

        System.out.println(a[2]);
        a[2] = 30;
        System.out.println(a[2]);
        a[0] = 33;

        a[4] = 6;

        // for i = 1 ...... n
        for(int i = 0; i < a.length; i++){
            System.out.println("Wert:"+a[i]+" ][ Position:"+i);
        }


        System.out.println("----------------");


        ArrayList<Integer> list = new ArrayList<>();

        System.out.println(list.size());

        list.add(55);
        System.out.println(list.get(0));
        System.out.println(list.size());
       //list.remove(0);
        list.add(22);
        list.add(75);
        System.out.println(list.size());


    }
}
