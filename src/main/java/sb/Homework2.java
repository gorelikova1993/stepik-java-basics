package sb;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        StringBuilder sb = new StringBuilder();
        String[] arr = str.split("\\s");
        boolean[] used = new boolean[arr.length];


        char currentChar = arr[0].charAt(arr[0].length() - 1);
        used[0] = true;
        sb.append(arr[0] + " ");

        for(int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (currentChar == arr[j].charAt(0) && !used[j]) {
                    sb.append(arr[j] + " ");
                    used[j] = true;
                    currentChar = arr[j].charAt(arr[j].length() - 1);
                    break;
                }
            }

        }
        System.out.println(sb);
    }
}
