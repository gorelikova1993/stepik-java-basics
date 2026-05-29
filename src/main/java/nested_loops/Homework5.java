package nested_loops;

import java.util.Scanner;

//Вывести на экран таблицу умножения от 1 до k.  Значение k (0<k<10) вводит пользователь.
//
//Элементы таблицы отделять знаком табуляции (знак табуляции должен быть также и в конце каждой строки).
public class Homework5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int i = 1;
        while (i <= k) {
            for (int j = 1; j <= k; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
            i++;
        }
    }
}
