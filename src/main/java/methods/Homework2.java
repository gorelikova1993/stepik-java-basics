package methods;

import java.util.Scanner;

//Напишите статический метод simpleInRange(),
// который подсчитывает количество простых чисел в заданном диапазоне.
// Если границы диапазона введены неверно (первое число больше второго), то в методе нужно их переставить местами.
//В методе main() продемонстрировано использование  simpleInRange() (этот код менять нельзя!)
//P. S. Используйте метод isPrime(), уже реализованный в предыдущем задании!
public class Homework2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int kol = simpleInRange(a, b);
        System.out.println(kol);
    }

    private static int simpleInRange(int a, int b) {
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        int count = 0;
        while (a <= b) {
            if (isPrime(a)) {
                count++;
            }
            a++;
        }
        return count;
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
