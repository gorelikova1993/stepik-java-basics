package class_arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        long seed = scanner.nextLong();
        int target = scanner.nextInt();

        int[] arr = new int[size];
        Random random = new Random(seed);
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(2, 16);
        }

        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 -i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (arr[i] == target) {
                index = i;
            }
        }
        if (index != -1) {
            int arr2[] = new int[index + 1];
            for (int i = 0; i < index + 1; i++) {
                arr2[i] = arr[i];
            }
            System.out.println(Arrays.toString(arr2));
        } else {
            System.out.println("ERROR");
        }
    }
}
