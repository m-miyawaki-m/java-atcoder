import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }

        int M = scanner.nextInt();
        int[] B = new int[M];
        for (int i = 0; i < M; i++) {
            B[i] = scanner.nextInt();
        }

        int L = scanner.nextInt();
        int[] C = new int[L];
        for (int i = 0; i < L; i++) {
            C[i] = scanner.nextInt();
        }

        Set<Integer> sums = new HashSet<>();
        for (int a : A) {
            for (int b : B) {
                for (int c : C) {
                    sums.add(a + b + c);
                }
            }
        }

        int Q = scanner.nextInt();
        for (int i = 0; i < Q; i++) {
            int X = scanner.nextInt();
            if (sums.contains(X)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

        scanner.close();
    }
}