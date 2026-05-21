package switch_topic;

import java.util.Scanner;

//Пользователь вводит целое число - номер месяца в году.
// Нужно вывести название поры года на английском языке с большой буквы.
// При неправильном номере месяца выводится "ERROR".
//Используйте оператор switch с лямбда - синтаксисом.
public class Homework5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfMonth = scanner.nextInt();
        String result = switch (numOfMonth) {
           case 1, 2, 12 -> "Winter";
           case 3, 4, 5 -> "Spring";
           case 6, 7, 8 -> "Summer";
           case 9, 10, 11 -> "Autumn";
            default -> "ERROR";
        };
        System.out.println(result);
    }
}
