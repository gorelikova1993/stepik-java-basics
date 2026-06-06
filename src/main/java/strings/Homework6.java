package strings;

import java.util.Scanner;

public class Homework6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] arr = s.split("\\s");
        String newWord = "";
        for (int i = 0; i < arr.length; i++) {
            newWord = newWord + capitalize(arr[i]) + " ";
        }
        System.out.println(newWord);
    }
    public static String capitalize(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
}
