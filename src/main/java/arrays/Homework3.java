package arrays;

import java.util.Scanner;

//Массив целых неотрицательных чисел вводится с консоли.
// Сначала пользователь вводит количество элементов массива, а потом сами элементы.
//
//Найти последний минимальный элемент и заменить его на -1.
//
//Преобразованный массив вывести на консоль, отделяя элементы пробелами.
public class Homework3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        int min = arr[0];
        for (int i = 0; i < size; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        for (int i = size - 1; i >= 0; i--) {
            if (arr[i] == min) {
                arr[i] = -1;
                break;
            }
        }
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
