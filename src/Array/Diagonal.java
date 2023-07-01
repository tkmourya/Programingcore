package Array;

import java.util.Arrays;

public class Diagonal {
    public static void main(String[] args) {
        int[][] b = {{11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}, {21, 22, 23, 24, 25}, {26, 27, 28, 29, 30}, {31, 32, 33, 34, 35}};
        int add=0;
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                if (i==0&&j==4||i==1&&j==3||i==2&&j==2||i==3&&j==1||i==4&&j==0) {
                    System.out.print(b[i][j]+" ");
                    add=add+b[i][j]; 
                }
            }
        }
        System.out.println();
        System.out.println("Addition = "+add);
    }
}
