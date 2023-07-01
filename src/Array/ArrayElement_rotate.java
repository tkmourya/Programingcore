package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayElement_rotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter Array length : "); // let  user enter 5
        int n = sc.nextInt();   // store Array length n = 5
        int []a = new int[n];
        System.out.println("Please enter element : ");// let user enter element (11 22 33 44 55)
        for (int i=0;i<n;i++){
            a[i]= sc.nextInt();   // store array of element
        }
        // print before rotate or cycled element
       // System.out.println("Before rotate element : "+Arrays.toString(a)); // [11,22,33,44,55]
        for(int i=0;i<a.length;i++){
        System.out.print(a[i]+" "); // 11 22 33 44 55
        }
        System.out.println();

        int temp=a[a.length-1];
        for(int i=n-1; i>0; i--){
            a[i]=a[i-1];
        }
        a[0]=temp;
        // print after rotate or cycled element
       // System.out.println("After rotate element : "+Arrays.toString(a)); // output -> [55,11,22,33,44]
            for (int i=0;i<a.length; i++) {
             System.out.print(a[i]+" ");  // output -> 55 11 22 33 44
      }
   }
}
