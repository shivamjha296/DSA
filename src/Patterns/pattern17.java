package Patterns;

import java.util.Scanner;

public class pattern17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter rows:");
        int rows=sc.nextInt();

        for(int i=rows;i>0;i--){
            char ch=(char)('A'+i-1);
            for(int j=i;j<=rows;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
