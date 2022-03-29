package gb.HomeWorkApp3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        arr1();
        Arr2();
        Arr3();
        Arr4();
        Arr6();
      System.out.println( Arr7());
    }

    static void arr1() {
        int[] arr = {0, 1, 0, 0, 1, 1};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] > 0) ? 0 : 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    static void Arr2() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        System.out.println(Arrays.toString(arr));
    }

    static void Arr3() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                System.out.println(arr[i] * 2);
            }

        }

    }

    static void Arr4() {
        int[][] arr = new int[4][4];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0, x = arr[i].length - 1; j < arr[i].length; j++, x--) {
                if (i == j || i == x) arr[i][j] = 1;
                else arr[i][j] = 2;
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    static int[] Arr5(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            i = initialValue;
        }
        return arr;
    }

    public static void Arr6() {
        int[] arr = new int[20];
        int max = arr.length;
        int min = arr[0];
        for (int i = 0; i < arr.length - 19; i++) {
            if (arr[i] == 0) arr[i] = min;
            else arr[i] = max;
            System.out.println(max);
            System.out.println(min);
        }
    }

    static boolean Arr7() {
        int[] arr = {2, 2, 2, 1, 2, 2, 10, 1};
       int sum = 0;
       int sum1=0;
        for (int i = 0; i < arr.length; i++) {
            sum  += arr[i];}
            for(int i=0;i< arr.length/2;i++){
            sum1+=arr[i];}
            if(sum==sum1){
          return true;
        }
       return  false;
    }
}








