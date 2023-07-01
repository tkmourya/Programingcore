package Loops;

import java.util.Scanner;

public class project_guessNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int myNumber = (int) (Math.random()*100);
        int UserNumber = 0;

        do {
            System.out.println("Enter My Guess Number(1-100) : ");
            UserNumber = sc.nextInt();
            if(UserNumber==myNumber){
                System.out.println("WOOHOO ... CORRECT NUMBER");
                break;
            }
            else if(UserNumber>myNumber){
                System.out.println("Your Number is too large");
            }
            else {
                System.out.println("Your Number is too Small");
            }
        }while (UserNumber>=0);
        System.out.print("My Number is : ");
        System.out.println(myNumber);
    }
}