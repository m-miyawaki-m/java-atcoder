import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();

       SortedSet<Long> repunitSums = new TreeSet<>();

        for (int i = 1; i <= 12; i++) {
            for (int j = 1; j <= 12; j++) {
                for (int k = 1; k <= 12; k++) {
                    long repunit1 = Long.parseLong("1".repeat(i));
                    long repunit2 = Long.parseLong("1".repeat(j));
                    long repunit3 = Long.parseLong("1".repeat(k));
                    repunitSums.add(repunit1 + repunit2 + repunit3);
                }
            }
        }

        Long[] repunitSumsArray = repunitSums.toArray(new Long[0]);
        System.out.println(repunitSumsArray[N - 1]);
  }
}