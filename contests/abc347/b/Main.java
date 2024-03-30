import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String S = scanner.next();

        Set<String> substrings = new HashSet<>();

        for (int i = 0; i < S.length(); i++) {
            for (int j = i + 1; j <= S.length(); j++) {
                substrings.add(S.substring(i, j));
            }
        }

        System.out.println(substrings.size());

        scanner.close();
    }
}