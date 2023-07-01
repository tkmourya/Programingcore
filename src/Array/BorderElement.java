package Array;

public class BorderElement {
    public static void main(String[] args) {
        int[][]a = {{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25},{26,27,28,29,30},{31,32,33,34,35}};
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
                if(i==0||i==a.length-1||j==0||j==a[i].length-1){
                    System.out.print(a[i][j]+" ");
                }
                else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
