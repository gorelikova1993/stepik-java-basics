package methods;

import java.util.Random;
import java.util.Scanner;

public class Homework11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] mas = new int[scan.nextInt()][scan.nextInt()];
        long seed = scan.nextLong();
        int ind = scan.nextInt();
        initArray(mas, seed);
        printArray(mas);
        System.out.println();
        mas = deleteRow(mas, ind);
        printArray(mas);
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

    public static int[][] deleteRow(int[][] arr, int row) {
        if (row > arr.length - 1 || row < 0) {
            return arr;
        }
        int[][] newArr = new int[arr.length - 1][];
        int newIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == row) continue;
            newArr[newIndex] = new int[arr[i].length];
            for (int j = 0; j < arr[i].length; j++) {
                newArr[newIndex][j] = arr[i][j];
            }
            newIndex++;
        }
        return newArr;
    }
}
