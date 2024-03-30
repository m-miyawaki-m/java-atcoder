import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int K = scanner.nextInt();

        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }

        boolean isFirst = true;
        for (int i = 0; i < N; i++) {
            if (A[i] % K == 0) {
                if (!isFirst) {
                    System.out.print(" ");
                }
                System.out.print(A[i] / K);
                isFirst = false;
            }
        }
        System.out.println();

        scanner.close();
    }
}