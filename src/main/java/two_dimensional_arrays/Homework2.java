package two_dimensional_arrays;

import java.util.Random;
import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();
        long seed = scanner.nextLong();

        int[][] arr = new int[rows][columns];
        Random random = new Random(seed);
        int[] sumNumbers = new int[columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                int currentNum = random.nextInt(-10, 11);
                arr[i][j] = currentNum;
                System.out.print(currentNum + "\t");
            }
            System.out.println();
        }
        System.out.println();
        int i = 0;
        int index = 0;
        while (i < columns) {
            int sum = 0;

            for (int j = 0; j < rows; j++) {
                if (arr[j][i] > 0) {
                    sum+=arr[j][i];
                }
            }
            sumNumbers[index] = sum;
            index++;
            i++;
        }

        for (int sumNumber : sumNumbers) {
            System.out.print(sumNumber + " ");
        }
    }
}
