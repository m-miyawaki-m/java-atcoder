import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String S = scanner.nextLine();
        HashMap<Character, Integer> frequencyMap = new HashMap<>();

        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        HashMap<Integer, Integer> countFrequency = new HashMap<>();
        for (int freq : frequencyMap.values()) {
            countFrequency.put(freq, countFrequency.getOrDefault(freq, 0) + 1);
        }

        boolean isGoodString = true;
        for (int count : countFrequency.values()) {
            if (count != 2 && count != 0) {
                isGoodString = false;
                break;
            }
        }

        System.out.println(isGoodString ? "Yes" : "No");
        scanner.close();
    }
}
