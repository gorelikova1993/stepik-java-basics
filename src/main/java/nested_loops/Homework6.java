package nested_loops;

import java.util.Scanner;

//Пользователь вводит два целых числа (границы отрезка числовой оси).
// Границы могут быть введены некорректно (первое число больше второго).
// В этом случае нужно границы переставить местами. Т.е. перебор должен быть всегда от меньшего к большему.
//
//Найти в данном отрезке первое число с максимальной суммой цифр.
// Для отрицательного числа при расчете суммы цифр знак не учитывается.
// Например, сумма цифр -324 равна 9.
public class Homework6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        if (x > y) {
            int temp = x;
            x = y;
            y = temp;
        }
        int maxNumber = 0;
        int maxSum = 0;
        for (int i = x ; i <= y; i++) {
            int sum = 0;
            int currentNumber = i;
            do {
                sum = sum + Math.abs(currentNumber % 10);
                currentNumber = currentNumber / 10;
            } while (currentNumber != 0);
            if (sum > maxSum) {
                maxSum = sum;
                maxNumber = i;
            }
        }
        System.out.println(maxNumber);
    }
}
