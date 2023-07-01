package Array;

public class ArraySum_InArray {
    public static void main(String[] args) {
        int[] a = {0, 50, 30, 20, 10, 80};
        int b = 0;
        int sum = 50;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (i <=j) {
                    b = a[i]+a[j];
                }
                if (b <= sum) {
                    System.out.println(a[i]+","+a[j]);
                }
            }
        }
    }
}