package for_while_topic;

import java.util.Scanner;

//Выполните задачу с использованием цикла do-while.
//Пользователь вводит целое число (контрольное число).
// А затем вводится произвольное количество положительных целых чисел.
// Признаком конца ввода является любое отрицательное число.
//Подсчитать во вводимой последовательности количество положительных делителей контрольного числа.
public class Homework5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int controlNum = scanner.nextInt();
        int num = scanner.nextInt();
        int count = 0;
        do {
            if (controlNum % num == 0) {
                count++;
            }
            num = scanner.nextInt();
        } while (num >= 0);
        System.out.println(count);
    }
}
