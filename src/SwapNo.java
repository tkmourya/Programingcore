public class SwapNo {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.print("Number swap "+a+" "+b );
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(" : After swap -> ");
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
}
