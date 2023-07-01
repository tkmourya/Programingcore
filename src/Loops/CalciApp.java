package Loops;

import java.util.Scanner;

public class CalciApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number for operator 1 2 3 4 --> + - * / ");
        int n = sc.nextInt();
        Calci c = new Calci();
        switch (n){
            case 1:
                c.add();
                break;
            case 2:
               c.sub();
                break;
            case 3:
                c.mul();
                break;
            case 4:
                c.div();
                break;
            default:
                System.out.println("invalid input");
        }
    }
}
class Calci{
    float a = 4;
    int b = 5;
    float c;
    public void add(){
        System.out.println(c=a+b);
    }
    public void sub(){
        System.out.println(c=a-b);
    }
    public void mul(){
        System.out.println(c=a*b);
    }
    public void div(){
        System.out.println(c=a/b);
    }
}