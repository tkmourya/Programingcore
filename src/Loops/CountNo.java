package Loops;

import java.util.Scanner;

public class CountNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number");
        int n = sc.nextInt();
        int c=0;
        while (n>0){
            c++;
            n=n/10;
        }
        System.out.println(c); // 67667 -> 5 output
    }
}
