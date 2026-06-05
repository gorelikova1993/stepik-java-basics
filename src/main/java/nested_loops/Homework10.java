package nested_loops;

import java.util.Scanner;

public class Homework10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                if (i % 2 == 0) {
                    sum += i;
                }
            }
        }
        System.out.println(sum);
    }
}
