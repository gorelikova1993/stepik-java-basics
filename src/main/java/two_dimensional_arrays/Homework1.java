package two_dimensional_arrays;

import java.util.Random;
import java.util.Scanner;

//Пользователь вводит количество строк и столбцов двумерного массива,
// а затем начальное значение генератора случайных чисел. Создать целочисленный массив
// указанной размерности и инициализировать его случайными числами от -5 до 4 (включительно).
// Массив вывести на консоль в виде таблицы, элементы которой отделяются знаками табуляции.
// Знак табуляции должен быть и в конце каждой строки.
//
//Найти максимальный элемент и подсчитать, сколько раз он встречается в массиве.
// Вывести максимальный элемент и найденное количество с  новой строки через пробел.
public class Homework1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();
        long seed = scanner.nextLong();

        int[][] arr = new int[rows][columns];
        Random random = new Random(seed);

        for (int i = 0; i < rows; i++) {
            for (int j = 0;j < columns; j++) {
                arr[i][j] = random.nextInt(-5, 5);
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        int max = arr[0][0];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        int count = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (arr[i][j] == max) {
                    count++;
                }
            }
        }
        System.out.println(max + " " + count);
    }
}
