package arrays;

import java.util.Random;
import java.util.Scanner;

//Массив из целых чисел заполнить случайными значениями от -5 до 5 (включая обе границы)
// Пользователь вводит размер массива, а затем начальное значение генератора случайных чисел.
//Вывести исходный массив на консоль в одной строке, разделяя элементы пробелами.
// Пробел должен быть в том числе и после последнего элемента массива.
//Найти сумму положительных элементов массива и произведение отрицательных элементов.
// Произведение быстро растет, поэтому оно должно иметь тип double.
//C новой строки вывести результаты программы через пробел (сначала сумму, а потом произведение).
public class Homework1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        long seed = scanner.nextLong();
        int[] arr = new int[size];
        Random random = new Random(seed);
        int sum = 0;
        double productOfNumbers = 1.0;
            for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(-5, 6);
            if (arr[i] > 0) {
                sum+=arr[i];
            }
            if (arr[i] < 0) {
                productOfNumbers*=arr[i];
            }
        }
            for (int a : arr) {
                System.out.print(a + " ");
            }
        System.out.println();
        System.out.println(sum + " " + productOfNumbers);
    }

}
