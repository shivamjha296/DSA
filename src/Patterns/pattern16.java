package Patterns;

import java.util.Scanner;

public class pattern16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter rows:");
        int rows=sc.nextInt();

        for(int i=0;i<rows;i++){
            char ch=(char)('A'+i);
            for(int j=0; j<=i;j++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
