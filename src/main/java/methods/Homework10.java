package methods;

import java.util.Random;
import java.util.Scanner;

public class Homework10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] ar = new int[scan.nextInt()];
        long seed = scan.nextLong();
        init(ar, seed);
        print(ar);
        int[] b = reduceAfterMax(ar);
        print(b);
    }

    public static void init(int[] arr, long seed) {
        Random random = new Random(seed);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(-3, 6);

        }
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int findMax(int[] arr) {
        int indexMax = 0;
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                indexMax = i;
            }
        }
        return indexMax;
    }

    public static int[] reduceAfterMax(int[] arr) {
        int lastIndex = findMax(arr);
        int size = lastIndex + 1;
        int[] newArr = new int[size];
        int j = 0;
        for (int i = 0; i < size; i++) {
            newArr[j] = arr[i];
            j+=1;
        }
        return newArr;
    }
}
