import java.util.Random;
import java.util.Scanner;

public class Daice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1 for dice: ");
        int choice=sc.nextInt();
        if (choice == 1) {
            Daice.pass();
        } else {
            System.out.println("invalid input");
        }
    }
    public static void pass(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number: ");
        int num = sc.nextInt();
        if(num>=12 || num<=1){
            System.out.println("not possible: ");
        }
        for(int x=1;x<=6;x++){
            int y = num - x;

             if (y<=6 && y>=1){
                    System.out.print("(" + x + "," + y + ") ");
                }
            }
        }
    }

