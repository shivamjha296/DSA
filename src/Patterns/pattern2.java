package Patterns;

import java.util.Scanner;

public class pattern2 {

    void pattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter rows:");
        int row=sc.nextInt();
        pattern2 p1=new pattern2();
        p1.pattern(row);
    }
}

