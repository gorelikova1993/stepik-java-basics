package methods;

import java.util.Scanner;
//Напишите статический метод maxNumberDivider(),
// который в заданном диапазоне находит первое число с наибольшим количеством делителей.
//Метод main() менять нельзя!
//Совет: сделайте отдельный метод,
// который подсчитывает количество делителей числа, а затем вызывайте его в методе maxNumberDivider().
public class Homework4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int max = maxNumberDivider(a, b);
        System.out.println(max);
    }

    private static int maxNumberDivider(int a, int b) {
        int maxNum = a;
        int maxSumDivider = sumDivider(a);
        while (a <= b) {
            a++;
            int sum = sumDivider(a);
            if (sum > maxSumDivider) {
                maxNum = a;
                maxSumDivider = sum;
            }
        }
        return maxNum;
    }

    private static int sumDivider(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                sum++;
            }
        }
        return sum;
    }
}
