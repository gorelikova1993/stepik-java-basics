package methods;

import java.util.Scanner;
//Напишите статический  метод printDivider(), который выводит все делители натурального
// числа через пробел (включая единицу и само число). Метод не возвращает никакого значения!
//Пример использования этого метода в main() менять нельзя!
public class Homework3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        printDivider(number);
    }
    private static void printDivider(int number) {
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
