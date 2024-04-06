import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        Map<Integer, Integer> minTastinessMap = new HashMap<>();

        for (int i = 0; i < N; i++) {
            int tastiness = scanner.nextInt();
            int color = scanner.nextInt();

            if (minTastinessMap.containsKey(color)) {
                int currentMin = minTastinessMap.get(color);
                minTastinessMap.put(color, Math.min(currentMin, tastiness));
            } else {
                minTastinessMap.put(color, tastiness);
            }
        }

        int maxOfMinTastiness = Integer.MIN_VALUE;
        for (int minTastiness : minTastinessMap.values()) {
            maxOfMinTastiness = Math.max(maxOfMinTastiness, minTastiness);
        }
        System.out.println(maxOfMinTastiness);
    }
}