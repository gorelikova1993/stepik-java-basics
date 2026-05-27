package for_while_topic;

import java.util.Scanner;

//Напишите программу с использованием цикла (любого):
//
//Пользователь вводит два целых числа, больших 1.
// Нужно вывести все общие делители этих чисел (числа, на которые оба числа делятся без остатка).
// Выводимые числа должны быть отделены пробелами.
public class Homework7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int min = b;
        if (a < b) {
            min = a;
        }
        for (int i = 1; i <= min; i++) {
            if (a % i == 0 && b % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
