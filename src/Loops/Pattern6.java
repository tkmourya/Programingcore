package Loops;

public class Pattern6 {
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            for (int j = 6; j >= i; j--) {
                System.out.print(" ");
            }
                for (int k = 1; k <= i; k++) {
                    System.out.print("*");
                    if (k < i) {                 // k is (*)
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
    // output
//     *
//    * *
//   * * *
//  * * * *
// * * * * *
//* * * * * *


