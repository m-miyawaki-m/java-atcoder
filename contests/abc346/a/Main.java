import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }

        for (int i = 0; i < N - 1; i++) {
            System.out.print(A[i] * A[i + 1]);
            if (i < N - 2) {
                System.out.print(" ");
            }
        }

        System.out.println();
        scanner.close();
    }
}