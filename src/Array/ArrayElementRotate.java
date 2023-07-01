package Array;

import java.util.Arrays;

public class ArrayElementRotate {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50};
        int t = a[a.length - 1];
        for (int i = a.length - 1; i > 0; i--) {
            a[i] = a[i - 1];
        }
        a[0] = t;
        System.out.println(Arrays.toString(a));  // output -> [50,10,20,30,40]
//        for(int i=0;i<=a.length-1;i++){
//            System.out.print(a[i]+" "); // output -> 50 10 20 30 40
    }
}
