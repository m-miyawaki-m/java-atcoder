import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        int[] charCount = new int[26];

        for (char c : S.toCharArray()) {
            charCount[c - 'a']++;
        }

        int maxFrequency = 0;
        char mostFrequentChar = 'a';
        for (int i = 0; i < 26; i++) {
            if (charCount[i] > maxFrequency) {
                maxFrequency = charCount[i];
                mostFrequentChar = (char) (i + 'a');
            }
        }

        System.out.println(mostFrequentChar);
        scanner.close();
    }
}