import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int T = scanner.nextInt();

        Map<Integer, Long> scores = new HashMap<>();
        Map<Long, Integer> scoreCounts = new HashMap<>();
        scoreCounts.put(0L, N);
        int diversity = 1;

        for (int i = 0; i < T; i++) {
            int A = scanner.nextInt();
            long B = scanner.nextLong();

            long oldScore = scores.getOrDefault(A, 0L);
            long newScore = oldScore + B;
            scores.put(A, newScore);

            scoreCounts.put(oldScore, scoreCounts.get(oldScore) - 1);
            scoreCounts.put(newScore, scoreCounts.getOrDefault(newScore, 0) + 1);
            if (scoreCounts.get(oldScore) == 0) {
                scoreCounts.remove(oldScore);
                diversity--;
            }
            if (scoreCounts.get(newScore) == 1) {
                diversity++;
            }
            System.out.println(diversity);
        }
    }
}
