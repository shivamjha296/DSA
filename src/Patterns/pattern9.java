package Patterns;

import java.util.Scanner;
// Pattern 7 + Pattern 8 (Combine both codes)
public class pattern9 {
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


//Refernce:  https://youtube.com/shorts/MuQf631Hj9c?si=hCHkhwNo993x3Frr