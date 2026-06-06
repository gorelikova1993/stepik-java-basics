package methods;

import java.util.Random;
import java.util.Scanner;

public class Homework9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] mas = new int[scan.nextInt()][scan.nextInt()];
        long seed = scan.nextLong();
        initArray(mas, seed);
        printArray(mas);
        System.out.println();
        printMaxIndex(mas);
    }

    public static void initArray(int[][] arr, long seed) {
        Random random = new Random(seed);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(0, 11);
            }
        }
    }

    public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void printMaxIndex(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            int max = arr[i][0];
            int maxIndex = 0;
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    maxIndex = j;
                }
            }
            System.out.print(maxIndex + " ");
        }
    }
}
