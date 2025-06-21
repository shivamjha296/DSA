package Patterns;

import java.util.Scanner;
//Pattern
//   *
//  * *
// * * *

//public class pattern7 {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter rows:");
//        int rows=sc.nextInt();
//
//        for(int i=1;i<=rows;i++){
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



//Refernce:  https://youtube.com/shorts/MuQf631Hj9c?si=hCHkhwNo993x3Frr

//Try this pattern as well
//  *
// ***
//*****

public class pattern7{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows:");
        int rows=sc.nextInt();

        for(int i=0; i<rows;i++){
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