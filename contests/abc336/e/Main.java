import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        scanner.close();

        System.out.println(findMaxPyramidSize(A));
    }

    private static int findMaxPyramidSize(int[] A) {
        int maxPyramidSize = 0;
        for (int i = 0; i < A.length; i++) {
            int size = 1;
            int minLeft = A[i];
            int minRight = A[i];

            // 左側を調べる
            for (int j = i - 1; j >= 0 && A[j] <= minLeft; j--, size++) {
                minLeft = A[j];
            }

            // 右側を調べる
            for (int j = i + 1; j < A.length && A[j] <= minRight; j++, size++) {
                minRight = A[j];
            }

            maxPyramidSize = Math.max(maxPyramidSize, size /2); // 中心を含めたピラミッドのサイズを計算
        }
        return maxPyramidSize;
    }
}