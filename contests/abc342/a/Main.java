import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String S = scanner.next();
        scanner.close();

        int length = S.length();
        int[] counts = new int[26];
        for (int i = 0; i < length; i++) {
            counts[S.charAt(i) - 'a']++;
        }

        for (int i = 0; i < length; i++) {
            if (counts[S.charAt(i) - 'a'] == 1) {
                System.out.println(i + 1);
                break;
            }
        }
    }
}
