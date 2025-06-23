package Basic_maths;

import java.util.Scanner;

public class reversenumber {
    int reverse(int num){
        int rev=0;
        while(num>0){
            int dig=num%10;
            num=num/10;
            rev=(rev*10)+dig;
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int number=sc.nextInt();

        reversenumber r1=new reversenumber();
        int revno=r1.reverse(number);
        System.out.println("Reverse no. is "+revno);
    }
}
