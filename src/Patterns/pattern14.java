package Patterns;
import java.util.Scanner;

public class pattern14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter rows:");
        int rows=sc.nextInt();

        for(int i=0;i<rows;i++){
            for(char ch='A';ch<='A'+i;ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}

