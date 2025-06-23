package Basic_maths;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class primeno {
    public static void main(String[] args) {
        int count =0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num:");
        int num=sc.nextInt();

        //Prime no. is a number that has exactly two factors one and itself

//        Method 1: Not optimal
//        for(int i=1; i<=num;i++){
//            if(num%i==0){
//                count++;
//            }
//        }

//        Method 2: Optimal   Here T.C= O(sqrt(n))
        for(int i=1;i*i<=num;i++){
            if(num%i==0){
                count++;
                if(num/i!=i){
                    count++;
                }
            }
        }

        if(count==2){
            System.out.println("Number is prime");
        }
        else{
            System.out.println("Number is not prime");
        }
    }
}
