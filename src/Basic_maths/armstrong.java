package Basic_maths;

import java.util.Scanner;
//An armstrong number is a number that is equal to the sum of its digits each raised to the power of the number of digits
public class armstrong {
    int armstrong(int num){
        int arm=0;
        while(num>0){
            int dig=num%10;
            num=num/10;
            arm+=dig*dig*dig;
        }
        return arm;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int number=sc.nextInt();

        armstrong a1=new armstrong();
        int armstrong=a1.armstrong(number);

        if(armstrong==number){
            System.out.println("No. is armstrong");
        }
        else{
            System.out.println("No. is not armstrong");
        }

    }
}
