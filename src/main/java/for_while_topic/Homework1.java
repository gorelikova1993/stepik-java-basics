package for_while_topic;

import java.util.Scanner;

//Пользователь вводит 10 оценок ученика (в 10-балльной системе).
// Нужно подсчитать, сколько среди них неудовлетворительных оценок (менее 4 баллов)
public class Homework1 {
    public static void main(String[] args) {
        int count = 0;
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        while (i < 10) {
            i++;
            int mark = scanner.nextInt();
            if (mark < 4) {
                count++;
            }
        }
        System.out.println(count);
    }
}
