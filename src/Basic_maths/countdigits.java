package Basic_maths;

import java.util.Scanner;
import static java.lang.Math.log10;

public class countdigits {

    // Method 1: Using loop
    int count(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }

    // Method 2: Using log10
    int count_log(int num) {
        if (num == 0) return 1; // log10(0) is undefined
        return (int) log10(num) + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int num = sc.nextInt();

        countdigits c1 = new countdigits();

        int loopCount = c1.count(num);
        System.out.println("Count using loop: " + loopCount);

        int logCount = c1.count_log(num);
        System.out.println("Count using log: " + logCount);
    }
}
