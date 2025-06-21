package Patterns;

import java.util.Scanner;

public class pattern11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows:");
        int rows=sc.nextInt();
        for(int i=0;i<rows;i++){
            int num = (i%2==0)? 1:0;
            for(int j=0;j<=i;j++){
                System.out.print(num);
                num=1-num;
            }
            System.out.println();
        }
    }
}
