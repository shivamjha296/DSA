package Patterns;

import java.util.Scanner;

public class pattern4 {

    void print(int n){
        for(int i=1; i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter rows:");
        int row=sc.nextInt();
        pattern4 p4=new pattern4();
        p4.print(row);

    }
}
