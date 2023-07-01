package Pro3;

import java.util.Scanner;

class ArmstrongNoOrNot{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp, arm=0, a ,p=0,n;
        System.out.println("Please enter number -> ");
       int num = sc.nextInt();
        temp=num;
        n=num;
        // finding number of digits-----------------
       while(n!=0){
           n = n/10;
           p++;
       }
        // checking armstrong no. or not------------
        while (num!=0) {

            a = num % 10;
            arm = (int) (arm + Math.pow(a,p));
            num = num / 10;

        }

            if (arm==temp) {
                System.out.println("yes");
            }
            else {
                System.out.println("no");
            }
        }
    }


/* int number = sc.nextInt();
int temp, remainder, result = 0, n = 0 ;
temp = number;

// Finding the number of digits

while (temp != 0)
{
temp /= 10;
++n;
}

temp = number;

// Checking if the number is armstrong

while (temp != 0)
{
remainder = temp%10;
result += Math.pow(remainder, n);
temp /= 10;
}

if(result == number)*/