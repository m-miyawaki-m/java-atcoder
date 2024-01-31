import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();

        boolean isValid = Character.isUpperCase(S.charAt(0));
        for (int i = 1; i < S.length(); i++) {
            if (Character.isUpperCase(S.charAt(i))) {
                isValid = false;
                break;
            }
        }

        System.out.println(isValid ? "Yes" : "No");
        scanner.close();
    }
}
