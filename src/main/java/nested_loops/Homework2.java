package nested_loops;

import java.util.Scanner;

//Пользователь вводит высоту и ширину рамки через пробел. Нарисовать рамку из звездочек.
//Если вводятся некорректные данные (высота или ширина <= 0), то вывести "ERROR".
//P.S. Пустые места внутри рамки - это пробелы.
public class Homework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        int width = scanner.nextInt();
        if (width <= 0 || height <= 0) {
            System.out.println("ERROR");
            return;
        }
        for(int i = 0; i < height; i++) {
            if (i == 0 || i == height - 1) {
                for (int j = 0; j < width; j++) {
                    System.out.print("*");
                }
            } else {
                System.out.print("*");
                for (int k = 1; k < width - 1; k ++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
