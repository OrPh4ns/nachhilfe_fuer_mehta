public class GetMin {


    static int getMin(int[] list) {
        int min = list[0];
        for (int i : list) {
            if(i<min){
                min=i;
            }
        }
        return min;
    }


    static int getMax(int[] list) {
        int max = list[0];
        for (int i : list) {
            if(i>max){
                max=i;
            }
        }
        return max;
    }

    public static void main(String[] args) {

        int[] zahlen = {5,6,2,7,8,2,1,3};

        System.out.println(getMin(zahlen));
        System.out.println(getMax(zahlen));
    }
}


/*
1 - min = 5 i = 5
2 - min = 5 , i = 6
3 - min = 5 , i = 2
4 - min = 2 , i = 7
5 - min = 2 , i = 8
6 - min = 2 , i = 2
7 = min = 1 , i = 3
8 - min = 1 , i = 3

min = 1

 */