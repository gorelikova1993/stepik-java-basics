package strings;

import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String word = scanner.nextLine();
        String[] arr = s.split("\\s+");
        String newS = "";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(word)) continue;
            newS = newS + arr[i] + " ";

        }
        System.out.println(newS);
    }
}
