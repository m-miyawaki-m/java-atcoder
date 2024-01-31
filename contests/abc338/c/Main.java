import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int[] Q = IntStream.range(0, N).map(i -> scanner.nextInt()).toArray();
        int[] A = IntStream.range(0, N).map(i -> scanner.nextInt()).toArray();
        int[] B = IntStream.range(0, N).map(i -> scanner.nextInt()).toArray();
 
        int maxPeople = 0;
        for (int x = 0; x <= 1000000; x++) {
            int minPeopleForX = Integer.MAX_VALUE;
            for (int i = 0; i < N; i++) {
                if (A[i] != 0) {
                    minPeopleForX = Math.min(minPeopleForX, Q[i] / A[i]);
                }
            }
            if (x > minPeopleForX) {
                break;
            }
            int minPeopleForY = Integer.MAX_VALUE;
            for (int i = 0; i < N; i++) {
                if (B[i] != 0) {
                    minPeopleForY = Math.min(minPeopleForY, (Q[i] - (A[i] * x)) / B[i]);
                }
            }
            maxPeople = Math.max(maxPeople, x + minPeopleForY);
        }

        System.out.println(maxPeople);
        scanner.close();
    }
}
