package methods;

import java.util.Scanner;

//Напишите две перегрузки статического  метода square() для вычисления площади прямоугольника.
// В одном случае в метод передаются две стороны прямоугольника, а в другом - одна сторона квадрата (все - вещественные числа).
//В методе main() вводится сначала целое число:
//1 означает, что нужно вычислить площадь квадрата. И затем следует ввод одного вещественного числа (стороны квадрата)
//2 означает, что нужно вычислить площадь прямоугольника. Затем следует ввод двух сторон прямоугольника.
//Выводимую площадь нужно представить с двумя знаками после десятичной точки.
public class Homework6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int type = scanner.nextInt();
        if (type == 1) {
            double a = scanner.nextDouble();
            square(a);
        } else {
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            square(a, b);
        }
    }
    private static void square(double a) {
        double result = a * a;
        System.out.printf("%.2f", result);
    }

    private static void square(double a, double b) {
        double result = a * b;
        System.out.printf("%.2f", result);
    }
}
