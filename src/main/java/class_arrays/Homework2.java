package class_arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        long seed = scanner.nextLong();

        double[] arr = new double[size];
        Random random = new Random(seed);

        for (int i = 0; i < size; i++) {
            arr[i] = random.nextDouble(0, 2);
        }
        System.out.println(Arrays.toString(arr));
        double max = arr[0];
        double min = arr[0];

        for (int i = 0; i < size; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        System.out.println(max + min);
    }
}
