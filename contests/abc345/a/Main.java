import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String S = scanner.next();
        if (S.startsWith("<") && S.endsWith(">") && S.substring(1, S.length() - 1).matches("=+")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        scanner.close();

    }
}
