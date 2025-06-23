package Basic_maths;

import java.util.Scanner;

import static java.lang.Math.min;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();

        //Any number has GCD the minimum GCD is always 1 as 1 divides every other number

        //Method 1 : Bruteforce
        int gcd=1;
//        for (int i = 1; i <= min(a, b); i++) {
//            if(a%i==0 && b%i==0){
//                gcd=i;
//            }
//        }

        //Method 2: Optimal Here, T.C = O(log to base phi (min(a,b)))
        while(a>0 && b>0){
            if(a>b){
                a=a%b;
            }
            else{
                b=b%a;
            }
        }
        if(a==0){
            System.out.println("GCD is:"+b);
        }
        else{
            System.out.println("GCD is:"+a);
        }
//        System.out.println("GCD is:"+gcd);
    }
}
