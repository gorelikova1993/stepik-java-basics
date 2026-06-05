package nested_loops;

import java.util.Scanner;

public class Homework7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number == 1) {
            System.out.println("NO");
        } else if (isPrime(number)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
    public static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
