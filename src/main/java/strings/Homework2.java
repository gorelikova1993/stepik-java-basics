package strings;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        if (isGMailAddress(str)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static boolean isGMailAddress(String string) {
        if (string.matches("^[-.a-zA-Z]{2,}@gmail\\.com$")) {
            return true;
        }
        return false;
    }
}
