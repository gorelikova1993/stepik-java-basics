package nested_loops;

import java.util.Scanner;

//Пользователь вводит ширину треугольника (от 1 до 9).
// Изобразить треугольник числами, как показано в примере теста.
public class Homework1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int width = a;
        for (int i = 0; i < a; i++) {
            for(int j = 0; j < width; j++) {
                System.out.print(width);
            }
            System.out.println();
            width--;
        }
    }
}
