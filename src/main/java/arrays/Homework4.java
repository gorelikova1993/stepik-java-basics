package arrays;

import java.util.Random;
import java.util.Scanner;

//Массив из целых чисел заполнить случайными значениями от -5 до 15 (включая обе границы)
// Пользователь вводит размер массива, а затем начальное значение генератора случайных чисел.
//
//Вывести исходный массив на консоль в одной строке, разделяя элементы пробелами.
// Пробел должен быть в том числе и после последнего элемента массива.
//
//Поменять местами первый максимальный и последний отрицательный элементы.
// Если отрицательных элементов нет в массиве, то он должен остаться без изменения.
//
//C новой строки вывести измененный массив, отделяя элементы пробелами.
public class Homework4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        long seed = scanner.nextLong();
        int[] arr = new int[size];
        Random random = new Random(seed);
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(-5, 16);
        }
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
        int max = arr[0];
        int min = 0;
        int lastMinIndex = 0;
        for(int i = size - 1; i >= 0; i--) {
            if (arr[i] < min) {
                min = arr[i];
                lastMinIndex = i;
                break;
            }
        }
        if (min == 0) {
            for (int x : arr) {
                System.out.print(x + " ");
            }
        } else {
            int indexMax = 0;
            for (int i = 0; i < size; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                    indexMax = i;
                }
            }
            int temp = arr[indexMax];
            arr[indexMax] = arr[lastMinIndex];
            arr[lastMinIndex] = temp;
            for (int x : arr) {
                System.out.print(x + " ");
            }
        }

    }
}
