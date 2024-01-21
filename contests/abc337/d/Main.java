import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int H = scanner.nextInt();
        int W = scanner.nextInt();
        int K = scanner.nextInt();
        scanner.nextLine();

        char[][] grid = new char[H][W];
        for (int i = 0; i < H; i++) {
            grid[i] = scanner.nextLine().toCharArray();
        }

        int minOperations = Integer.MAX_VALUE;

        for (int i = 0; i < H; i++) {
            for (int j = 0; j <= W - K; j++) {
                int operations = 0;
                for (int k = 0; k < K; k++) {
                    if (grid[i][j + k] == '.') {
                        operations++;
                    } else if (grid[i][j + k] == 'x') {
                        operations = Integer.MAX_VALUE;
                        break;
                    }
                }
                minOperations = Math.min(minOperations, operations);
            }
        }

        for (int j = 0; j < W; j++) {
            for (int i = 0; i <= H - K; i++) {
                int operations = 0;
                for (int k = 0; k < K; k++) {
                    if (grid[i + k][j] == '.') {
                        operations++;
                    } else if (grid[i + k][j] == 'x') {
                        operations = Integer.MAX_VALUE;
                        break;
                    }
                }
                minOperations = Math.min(minOperations, operations);
            }
        }

        if (minOperations == Integer.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(minOperations);
        }

        scanner.close();
    }
}