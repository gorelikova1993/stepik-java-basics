package sb;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        line = line.trim();
        String[] arr = line.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].contains("z")) {
                sb.append("ERROR");
                sb.append(" ");
            } else {
                sb.append(arr[i]);
                sb.append(" ");
            }
        }
        System.out.println(sb);
    }
}
