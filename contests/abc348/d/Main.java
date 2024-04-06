import java.util.*;

class Main {
    static final int[] dx = { -1, 1, 0, 0 };
    static final int[] dy = { 0, 0, -1, 1 };
    static final int MAX_ENERGY = 200 * 200;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int W = scanner.nextInt();
        scanner.nextLine();

        char[][] grid = new char[H][W];
        int[][] energyGrid = new int[H][W];
        for (int i = 0; i < H; i++) {
            Arrays.fill(energyGrid[i], MAX_ENERGY);
        }
        int startX = -1, startY = -1, endX = -1, endY = -1;

        for (int i = 0; i < H; i++) {
            String line = scanner.nextLine();
            for (int j = 0; j < W; j++) {
                grid[i][j] = line.charAt(j);
                if (grid[i][j] == 'S') {
                    startX = i;
                    startY = j;
                } else if (grid[i][j] == 'T') {
                    endX = i;
                    endY = j;
                }
            }
        }

        int N = scanner.nextInt();
        for (int i = 0; i < N; i++) {
            int R = scanner.nextInt() - 1;
            int C = scanner.nextInt() - 1;
            int E = scanner.nextInt();
            energyGrid[R][C] = E;
        }

        Queue<int[]> queue = new LinkedList<>();
        boolean[][][] visited = new boolean[H][W][MAX_ENERGY + 1];
        queue.offer(new int[] { startX, startY, 0 });
        visited[startX][startY][0] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0], y = current[1], energy = current[2];

            if (x == endX && y == endY) {
                System.out.println("Yes");
                return;
            }

            energy = Math.max(energy, energyGrid[x][y]);
            if (energy > 0 && !visited[x][y][energy]) {
                visited[x][y][energy] = true;
                for (int i = 0; i < 4; i++) {
                    int nx = x + dx[i], ny = y + dy[i];
                    if (nx >= 0 && nx < H && ny >= 0 && ny < W && grid[nx][ny] != '#') {
                        int nextEnergy = energy - 1;
                        if (grid[nx][ny] == 'E') {
                            nextEnergy = Math.max(nextEnergy, energyGrid[nx][ny]);
                        } else {
                            nextEnergy--;
                        }
                        if (nextEnergy >= 0 && !visited[nx][ny][nextEnergy]) {
                            queue.offer(new int[] { nx, ny, nextEnergy });
                            visited[nx][ny][nextEnergy] = true;
                        }
                    }
                }
            }
        }

        System.out.println("No");
    }
}
