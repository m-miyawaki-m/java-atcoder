import java.util.Scanner;

public class Main {
    private static final int MOD = 998244353;
    private static final int[] dx = {0, 0, 1, -1};
    private static final int[] dy = {1, -1, 0, 0};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int W = scanner.nextInt();
        scanner.nextLine(); // 改行を読み飛ばす

        char[][] grid = new char[H][W];
        for (int i = 0; i < H; i++) {
            grid[i] = scanner.nextLine().toCharArray();
        }

        System.out.println(calculateExpectedValue(grid, H, W));
    }

    private static long calculateExpectedValue(char[][] grid, int H, int W) {
        boolean[][] visited = new boolean[H][W];
        int connectedComponents = 0;
        int redCount = 0;
        long changes = 0;

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if (grid[i][j] == '#' && !visited[i][j]) {
                    dfs(grid, visited, i, j, H, W);
                    connectedComponents++;
                }
                if (grid[i][j] == '.') {
                    redCount++;
                    changes += calculateChange(grid, i, j, H, W);
                }
            }
        }

        long expectedValue = (connectedComponents + (changes * modInverse(redCount, MOD)) % MOD) % MOD;
        return expectedValue;
    }

    private static void dfs(char[][] grid, boolean[][] visited, int x, int y, int H, int W) {
        if (x < 0 || x >= H || y < 0 || y >= W || visited[x][y] || grid[x][y] == '.') return;
        visited[x][y] = true;
        for (int d = 0; d < 4; d++) {
            dfs(grid, visited, x + dx[d], y + dy[d], H, W);
        }
    }

    private static int calculateChange(char[][] grid, int x, int y, int H, int W) {
        for (int d = 0; d < 4; d++) {
            int nx = x + dx[d];
            int ny = y + dy[d];
            if (nx >= 0 && nx < H && ny >= 0 && ny < W && grid[nx][ny] == '#') {
                return 0;
            }
        }
        return 1;
    }

    private static long modInverse(int a, int m) {
        long m0 = m;
        long y = 0, x = 1;

        if (m == 1)
            return 0;

        while (a > 1) {
            long q = a / m;
            long t = m;

            m = a % m;
            a = t;
            t = y;

            y = x - q * y;
            x = t;
        }

        if (x < 0)
            x += m0;

        return x;
    }
}
