import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String S = scanner.nextLine();
        S = S.replaceAll("\\s+", "");
        String result = isExtendedABCString(S) ? "Yes" : "No";
        System.out.println(result);

        scanner.close();
    }

    private static boolean isExtendedABCString(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) > s.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }
}