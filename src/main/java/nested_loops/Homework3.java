package nested_loops;

import java.util.Scanner;

//Пользователь вводит высоту треугольника.
// Нарисовать треугольник из звездочек, как показано в примере теста.
//Если вводятся некорректные данные (высота <= 0), то вывести "ERROR".
public class Homework3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        if (height <= 0) {
            System.out.println("ERROR");
            return;
        }
        int width = height;
        for (int i = 0; i < height; i ++) {
            if (width == height) {
                for(int j = 0; j < width; j ++) {
                    System.out.print("*");
                }
            } else {
                for (int k = 0; k < height -width; k++) {
                    System.out.print(" ");
                }
                for(int j = 0; j < width; j ++) {
                    System.out.print("*");
                }
            }

            System.out.println();
            width--;
        }
    }
}
