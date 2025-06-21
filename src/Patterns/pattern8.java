package Patterns;

import java.util.Scanner;
//Pattern
//* * * *
// * * *
//  * *
//   *
//public class pattern8 {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter rows:");
//        int rows=sc.nextInt();
//
//        for(int i=rows;i>=1;i--){
//            for(int j=1;j<=rows-i;j++){
//                System.out.print(" ");
//            }
//            for(int k=1;k<=i;k++){
//                System.out.print("* ");
//            }
//            System.out.println();
//
//        }
//    }
//}

// jUst reverse condition for row in pattern7


//The pattern here is
//*****
// ***
//  *

public class pattern8{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows:");
        int rows=sc.nextInt();

        for(int i=rows-1; i>=0;i--){
            for(int j=0;j<rows-i-1;j++){
                System.out.print(" ");
            }
            for(int k=0; k<2*i+1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}