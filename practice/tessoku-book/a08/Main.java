import java.util.Scanner;
import java.util.Arrays;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int H = scanner.nextInt();
        int W = scanner.nextInt();

        int[][] nums = new int[H][W];

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                nums[i][j] = scanner.nextInt();
            }
        }
        // printArray1(nums);
        int[][] sums = calculateCumulativeSum(nums, H, W);
        processQueries(sums, H, W);
    }

    public static void printArray1(int[][] nums) {
        int Q = scanner.nextInt();
        scanner.nextLine();
        for (int q = 0; q < Q; q++) {
            int[] nums2 = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            int result = 0;
            for (int i = nums2[0] - 1; i < nums2[2]; i++) {
                for (int j = nums2[1] - 1; j < nums2[3]; j++) {
                    result += nums[i][j];
                }
                if (i == nums2[2] - 1)
                    System.out.println(result);
            }
        }
    }

    public static int[][] calculateCumulativeSum(int[][] nums, int H, int W) {
        int[][] sums = new int[H][W];
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                sums[i][j] = sums[i - 1][j] + sums[i][j - 1] - sums[i - 1][j - 1] + nums[i - 1][j - 1];
            }
        }
        return sums;
    }

    public static void processQueries(int[][] sums, int H, int W) {
        int Q = scanner.nextInt();
        for (int q = 0; q < Q; q++) {
            int x1 = scanner.nextInt();
            int y1 = scanner.nextInt();
            int x2 = scanner.nextInt() + 1;
            int y2 = scanner.nextInt() + 1;

            // 範囲チェックを追加
            if (x1 >= H || y1 >= W || x2 > H || y2 > W) {
                System.out.println("Invalid query range.");
                continue;
            }

            int result = sums[x2][y2] - sums[x1][y2] - sums[x2][y1] + sums[x1][y1];
            System.out.println(result);
        }
    }

}