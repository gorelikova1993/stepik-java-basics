package two_dimensional_arrays;

import java.util.Random;
import java.util.Scanner;

//Пользователь вводит количество строк и столбцов двумерного массива, а затем начальное значение генератора случайных чисел.
// Создать массив целых чисел указанной размерности и инициализировать его случайными числами от -10 до 10 (включительно).
// Массив вывести на консоль в виде таблицы, элементы которой отделяются знаками табуляции.
// Знак табуляции должен быть и в конце каждой строки.
//
//В каждой строке найти первый отрицательный элемент и вывести индекс соответствующего столбца или слово "NO", если он отсутствует.
public class Homework3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();
        int seed = scanner.nextInt();

        int[][] arr = new int[rows][columns];
        Random random = new Random(seed);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arr[i][j] = random.nextInt(-10, 11);
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        boolean isPrinted = false;
        for (int i = 0; i < rows; i++) {
            isPrinted = false;
            for (int j = 0; j < columns; j++) {
                if (arr[i][j] < 0) {
                    System.out.println(j);
                    isPrinted = true;
                    break;
                }
            }
            if (!isPrinted) {
                System.out.println("NO");
            }
        }

    }
}
