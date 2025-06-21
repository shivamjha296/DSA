package Patterns;

import java.util.Scanner;

public class pattern10 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows:");
        int rows=sc.nextInt();
        for(int i=1; i<=2*rows-1;i++){
            int stars=i;
            if(i>rows){
                stars=2*rows-i;
            }
            for(int j=0; j<stars;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

//public class pattern10 {
//
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter rows:");
//        int rows=sc.nextInt();
//
//        for(int i=0; i<rows;i++){
//            for(int j=0; j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//        for(int i=rows-1; i>0;i--){
//            for(int j=0;j<i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//}