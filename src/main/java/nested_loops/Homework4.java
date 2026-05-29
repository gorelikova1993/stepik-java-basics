package nested_loops;

import java.util.Scanner;
//Пользователь вводит ширину треугольника.
// Нарисовать треугольник из звездочек, как показано в примерах теста.
//Если вводятся некорректные данные (ширина <= 0), то вывести "ERROR".
//Р.S. В конце каждой строки невидимых пробелов нет! (Перевод курсора сразу после звездочек).
public class Homework4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = scanner.nextInt();
        if (width <= 0) {
            System.out.println("ERROR");
            return;
        }
        int j = width;
        int k = 2;
        for (int i = 0; i < width; i++) {
            System.out.print("*");
        }
        System.out.println();
        do {
            for (int c = 0; c < k; c+=2) {
                System.out.print(" ");
            }
            for (int i = 0; i < width - k; i++) {
                System.out.print("*");
            }
            System.out.println();
            k+=2;
            j--;

        } while (j > 0);


    }
}
