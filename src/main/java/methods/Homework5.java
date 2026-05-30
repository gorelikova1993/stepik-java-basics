package methods;
//Напишите статический метод printTriangle(), который выводит на консоль треугольник,
// показанный в примерах тестов. Параметрами метода являются ширина основания и символ, которым рисуется треугольник.
//В конце каждой строки нет невидимых пробелов, курсор переводится сразу после последнего символа.
//Также напишите метод main(), в котором вводятся с консоли ширина треугольника и символ, а затем вызывается метод printTriangle()

import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String str = scanner.next();
        char symbol = str.charAt(0);
        printTriangle(number, symbol);
    }

    private static void printTriangle(int num, char sym) {
        int rows = (num + 1) / 2;

        for (int i = 1; i <= rows; i++) {
            int symbols = num % 2 == 0 ? i * 2 : i * 2 - 1;
            int spaces = (num - symbols) / 2;

            for (int j = 0; j < spaces; j++) {
                System.out.print(' ');
            }

            //symbols
            for (int k = 0; k < symbols; k++) {
                System.out.print(sym);
            }
            System.out.println();
        }
    }
}
