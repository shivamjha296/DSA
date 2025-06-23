package Recursion;

import java.util.Scanner;

//Print numbers 1 to n
public class Recursion1 {
    int count =0;
    void print(int num){
        if(count>num){
            return;
        }
        System.out.println(count);
        count++;
        print(num);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int num=sc.nextInt();

        Recursion1 r1=new Recursion1();
        r1.print(num);
    }
}
