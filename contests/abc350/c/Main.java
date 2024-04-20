import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] A = new int[N];
        int[] position = new int[N + 1];

        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
            position[A[i]] = i;
        }

        StringBuilder swaps = new StringBuilder();
        int swapCount = 0;

        for (int i = 0; i < N; i++) {
            while (A[i] != i + 1) {
                int swapWithIndex = position[i + 1];
                swaps.append((i + 1) + " " + (swapWithIndex + 1) + "\n");

                position[A[i]] = swapWithIndex;
                position[A[swapWithIndex]] = i;

                int temp = A[i];
                A[i] = A[swapWithIndex];
                A[swapWithIndex] = temp;

                swapCount++;
            }
        }

        System.out.println(swapCount);
        System.out.print(swaps.toString());

        scanner.close();
    }
}
