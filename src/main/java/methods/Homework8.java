package methods;

import java.util.Random;
import java.util.Scanner;

public class Homework8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] ar = new int[scan.nextInt()];
        long seed = scan.nextLong();
        init(ar,seed);
        print(ar);
        int ind = findMax(ar);
        System.out.println(ind);
    }

    public static void init(int[] arr, long seed) {
        Random random = new Random(seed);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(-3, 6);
        }
    }

    public static void print(int[] arr) {
        for (int x : arr) {
            System.out.print(x + " ");
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
}
