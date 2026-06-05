package nested_loops;

import java.util.Scanner;

public class Homework11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int sum = 0;

        while (a <= b) {
            for (int i = 2; i <= a; i++) {
                if (a % i == 0) {
                    sum+=i;
                    break;
                }
            }
            a++;
        }
        System.out.println(sum);
    }
}
