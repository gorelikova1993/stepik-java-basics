package sb;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        String str = primer(a, b);
        System.out.println(str);
    }

    public static String primer(int a, int b) {
        int sum = a + b;
        return a + " + " + b + " = " + sum;
    }
}
