package strings;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println(delCom(str));
    }
    private static String delCom(String s) {
        if (s.endsWith(".com")) {
            return s.substring(0, s.length() - 4);
        }
        return s;
    }
}
