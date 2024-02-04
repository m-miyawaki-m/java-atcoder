import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int W = scanner.nextInt();
        int N = scanner.nextInt();
        
        char[][] grid = new char[H][W];
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                grid[i][j] = '.';
            }
        }
        
        int x = 0, y = 0;
        int dx = -1, dy = 0;
        
        for (int i = 0; i < N; i++) {
            if (grid[x][y] == '.') {
                grid[x][y] = '#';
                int temp = dx;
                dx = dy;
                dy = -temp;
            } else {
                grid[x][y] = '.';
                int temp = dx;
                dx = -dy;
                dy = temp;
            }
            x = (x + dx + H) % H;
            y = (y + dy + W) % W;
        }
        
        // for (int i = 0; i < H; i++) {
        //     for (int j = 0; j < W; j++) {
        //         System.out.print(grid[i][j]);
        //     }
        //     System.out.println();
        // }
        Arrays.stream(grid).forEach(row -> {
            IntStream.range(0, row.length).mapToObj(i -> row[i]).forEach(System.out::print);
            System.out.println();
        });

        scanner.close();
    }
}
