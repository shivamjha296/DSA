package Patterns;

import java.util.Scanner;

public class pattern12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows:");
        int rows=sc.nextInt();
        for(int i=1;i<=rows;i++){
            //Numbers
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            //Space
            for(int j=1;j<=2*(rows-i);j++){
                System.out.print(" ");
            }
            //Numbers
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
