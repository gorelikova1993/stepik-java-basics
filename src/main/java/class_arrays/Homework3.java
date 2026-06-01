package class_arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        long seed = scanner.nextLong();
        int startIndex = scanner.nextInt();
        int lastIndex = scanner.nextInt();

        int[] arr = new int[size];
        Random random = new Random(seed);

        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(10 , 21);
        }
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < lastIndex - startIndex; i++) {
            for (int j = startIndex; j < lastIndex - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
