import java.util.Scanner;

public class MainTLE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int Q = scanner.nextInt();

        int[] xCoords = new int[N + 1];
        int[] yCoords = new int[N + 1];

        xCoords[1] = 1;
        yCoords[1] = 0;

        for (int i = 2; i <= N; i++) {
            xCoords[i] = i;
            yCoords[i] = 0;
        }

        for (int q = 0; q < Q; q++) {
            int queryType = scanner.nextInt();
            if (queryType == 1) {
                char direction = scanner.next().charAt(0);
                moveHead(xCoords, yCoords, N, direction);
            } else if (queryType == 2) {
                int p = scanner.nextInt();
                System.out.println(xCoords[p] + " " + yCoords[p]);
            }
        }
    }

    private static void moveHead(int[] xCoords, int[] yCoords, int N, char direction) {
        int oldX = xCoords[1];
        int oldY = yCoords[1];

        switch (direction) {
            case 'R':
                xCoords[1]++;
                break;
            case 'L':
                xCoords[1]--;
                break;
            case 'U':
                yCoords[1]++;
                break;
            case 'D':
                yCoords[1]--;
                break;
        }

        for (int i = 2; i <= N; i++) {
            int tempX = xCoords[i];
            int tempY = yCoords[i];
            xCoords[i] = oldX;
            yCoords[i] = oldY;
            oldX = tempX;
            oldY = tempY;
        }
    }
}