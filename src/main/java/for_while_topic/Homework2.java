package for_while_topic;

import java.util.Scanner;

//Выполните задачу с использованием цикла while.
//Нужно найти произведение всех целых чисел в диапазоне, указанном пользователем.
//Пользователь вводит границы диапазона через пробел. При этом не всегда первое вводимое число меньше второго.
//Произведение чисел быстро растет, поэтому для него используйте переменную типа double.
//Форматирование при выводе не используйте!
public class Homework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        double productOfNumbers = 1.0;
        if (a > b) {
            int temp = b;
            b = a;
            a = temp;
        }
        while (a <= b) {
            productOfNumbers = productOfNumbers * a;
            a++;
        }
        System.out.println(productOfNumbers);
    }
}
