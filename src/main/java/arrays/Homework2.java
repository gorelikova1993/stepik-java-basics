package arrays;

import java.util.Random;
import java.util.Scanner;

//Массив из вещественных чисел типа double заполнить случайными значениями от 0 до 5 (не включая).
// Пользователь вводит размер массива, а затем начальное значение генератора случайных чисел.
//
//Вывести исходный массив на консоль в одной строке, разделяя элементы пробелами.
// Пробел должен быть в том числе и после последнего элемента массива.
//
//Найти среднее арифметическое элементов массива и вывести его с новой строки.
// Заменить все элементы  больше среднего его значением.
//
//C новой строки вывести преобразованный массив. Элементы отделяются пробелами.
//
//Все вещественные числа при выводе округляются до двух знаков после десятичной точки
// (нужно выполнить форматированный вывод, а не округлять с помощью функций).
// После вывода среднего не должно быть пробелов, сразу перевод курсора!
public class Homework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        long seed = scanner.nextLong();
        Random random = new Random(seed);
        double[] arr = new double[size];
        double avg = 0.0;
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextDouble(0 , 5);
            avg += arr[i];
            System.out.printf("%.2f ", arr[i]);
        }
        System.out.println();
        avg = avg / size;
        System.out.printf("%.2f", avg);
        System.out.println();
        for (int i = 0; i < size; i++) {
            if (arr[i] > avg) {
                arr[i] = avg;
            }
            System.out.printf("%.2f ", arr[i]);
        }
    }
}
