package Array;

import java.util.Scanner;

public class Two_1DArray_marge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // take array length
        System.out.println("Please enter array length");
        int n1 = sc.nextInt();
        int[] a = new int[n1];
        // take element
        System.out.println("Please enter array 'A' multiple number : ");
        for (int i = 0; i < n1; i++) {
            a[i] = sc.nextInt();
        }
        // take array length
        System.out.println("Please enter array length");
        int n2 = sc.nextInt();
        int[] b = new int[n2];
        // take element
        System.out.println("Please enter array 'B' multiple number : ");
        for (int i = 0; i < n2; i++) {
            b[i] = sc.nextInt();
        }
        // marge array
        int size = n1 + n2;
        int[] c = new int[size];
        System.out.println("Marge Array : ");
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        for (int i = a.length; i < c.length; i++) {
            c[i] = b[i - a.length];
        }
        // Print array after marge
        for (int i = 0; i < c.length; i++) {
            System.out.print(+c[i] + " ");
        }
    }
}
