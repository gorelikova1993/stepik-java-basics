package for_while_topic;
//Выполните задачу с использованием цикла do-while.
//Пользователь вводит произвольное целое число (оно может быть отрицательным).
// Найдите количество цифр в числе и сумму цифр.
//Выведите через пробел сначала количество, а потом сумму цифр.

import java.util.Scanner;

public class Homework6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        num = Math.abs(num);
        int count = 0;
        int sum = 0;
        do {
            sum = sum + (num % 10);
            count++;
            num = num / 10;
        } while (num != 0);
        System.out.println(count + " " + sum);
    }
}
