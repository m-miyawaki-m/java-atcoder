import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int W = scanner.nextInt();
        int N = scanner.nextInt();
        String T = scanner.next();
        char[][] grid = new char[H][W];
        for (int i = 0; i < H; i++) {
            grid[i] = scanner.next().toCharArray();
        }

        // 高橋君が現在いる可能性のあるマスのリストを初期化
        boolean[][] possible = new boolean[H][W];
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if (grid[i][j] == '.') {
                    possible[i][j] = true;
                }
            }
        }

        // 移動の指示に従って、可能な位置を更新
        for (char direction : T.toCharArray()) {
            boolean[][] nextPossible = new boolean[H][W];
            for (int i = 0; i < H; i++) {
                for (int j = 0; j < W; j++) {
                    if (!possible[i][j]) continue;
                    if (direction == 'L' && j > 0 && grid[i][j-1] == '.') nextPossible[i][j-1] = true;
                    if (direction == 'R' && j < W-1 && grid[i][j+1] == '.') nextPossible[i][j+1] = true;
                    if (direction == 'U' && i > 0 && grid[i-1][j] == '.') nextPossible[i-1][j] = true;
                    if (direction == 'D' && i < H-1 && grid[i+1][j] == '.') nextPossible[i+1][j] = true;
                }
            }
            // 移動の指示の逆方向に移動する可能性のある位置を考慮
            for (int i = 0; i < H; i++) {
                for (int j = 0; j < W; j++) {
                    if (!nextPossible[i][j]) continue;
                    if (direction == 'L' && j < W-1 && grid[i][j+1] == '.') possible[i][j+1] = true;
                    if (direction == 'R' && j > 0 && grid[i][j-1] == '.') possible[i][j-1] = true;
                    if (direction == 'U' && i < H-1 && grid[i+1][j] == '.') possible[i+1][j] = true;
                    if (direction == 'D' && i > 0 && grid[i-1][j] == '.') possible[i-1][j] = true;
                }
            }
            possible = nextPossible;
        }

        // 可能な位置の数をカウント
        int count = 0;
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if (possible[i][j]) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}