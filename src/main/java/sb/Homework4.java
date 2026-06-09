package sb;

import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        boolean hasDigits = false;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= '0' && c <= '9') {
                hasDigits = true;
                int digit = c - '0';
                sb.append(c + "+");
                sum+=digit;
            }
        }
        if (hasDigits) {
            String newStr  = sb.toString().substring(0, sb.length() - 1);
            System.out.println(newStr + "=" + sum);
        } else {
            System.out.println("ERROR");
        }
    }
}
