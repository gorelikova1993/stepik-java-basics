package for_while_topic;

import java.util.Scanner;

//Выполните задачу с использованием цикла for.
//Найти минимальное число в последовательности целых чисел.
//Пользователь вводит количество целых чисел, а затем сами числа через пробел.
public class Homework3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int min =  Integer.MAX_VALUE;
        for (int i = 0; i  < count; i++) {
            int num = scanner.nextInt();
             if (min > num) {
                 min = num;
             }
        }
        System.out.println(min);
    }
}
