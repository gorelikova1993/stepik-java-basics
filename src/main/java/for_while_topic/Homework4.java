package for_while_topic;

import java.util.Scanner;

//Выполните задачу с использованием цикла for.
//
//Найти сумму делителей целого положительного числа. Например, вводится число 12.
// Сумма его делителей: 1+2+3+4+6+12=28.
public class Homework4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
