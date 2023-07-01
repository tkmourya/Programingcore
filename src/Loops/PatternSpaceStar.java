package Loops;

public class PatternSpaceStar {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print(" ");
            }
            for(int k=1;k<=4;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
// output
//    ****
//   ****
//  ****
// ****
/*class PatternSS{
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <=(5-i); j++) {
                System.out.print(" ");
            }
            for(int k=1;k<=4;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}*/