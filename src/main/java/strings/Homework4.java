package strings;

import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] arr = s.split("\\s+");
        int maxLength = 0;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > maxLength) {
                maxLength = arr[i].length();
                index = i;
            }
        }
        System.out.println(arr[index]);
    }
}
