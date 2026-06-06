package strings;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        String str3 = scanner.nextLine();
        String word = findWord(str1) + findWord(str2) + findWord(str3);
        System.out.println(word);
    }
    public static String findWord(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) ==  ';') {
                int startIndex = i;
                int lastIndex = 0;
                for (int j = startIndex + 1; j < str.length(); j++) {
                    if (str.charAt(j) == ';') {
                        lastIndex = j;
                        break;
                    }
                }
                return str.substring(startIndex + 1, lastIndex);
            }
        }
        return "";
    }
}
