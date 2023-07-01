package Loops;

public class Pattern {
    public static void main(String[] args) {
        // outer loop
    for (int i=1;i<=4;i++){
        // inner loop
        for (int j=1;j<=5;j++){
            // print (* * * * *)
            if(i==1||i==4){
                System.out.print("*"+" ");
            }
            // print (*)
            else {
                if(j==1||j==5) {
                    System.out.print("*");
                }
                // print (space)
                else{
                    System.out.print(" ");
                }
                System.out.print(" ");
            }
        }
        System.out.println();
        }
    }
}
