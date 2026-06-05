package nested_loops;

import java.util.Scanner;

public class Homework9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        boolean isExisted = false;
        for (int i = a; i <= b; i++) {
            if (isCompositeNumber(i)) {
                System.out.println(i);
                isExisted = true;
                break;
            }
        }
        if (!isExisted) {
            System.out.println("NO");
        }
    }

    public static boolean isCompositeNumber(int number) {
        if (number == 1) {
            return false;
        }
        for (int i = 2; i <= number/2; i++) {
            if (number % i == 0) {
                return true;
            }
        }
        return false;
    }
}
