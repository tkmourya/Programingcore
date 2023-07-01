package Array;

import java.util.Scanner;

public class Two_One_dimentionalArray_marge {
    public static void main(String[] args) {
        int []a={11,22,45,67,89};
        int []b={35,67,89,56};
        int size = a.length+b.length;
        int []c = new int[size];
        System.out.println("Marge Array : ");
        for(int i=0;i<a.length;i++){
            c[i]=a[i];
        }
        for(int i=a.length;i<c.length;i++){
            c[i]=b[i-a.length];
        }
        for (int i=0;i<c.length;i++){
            System.out.print(+c[i]+" ");
        }

    }
}
