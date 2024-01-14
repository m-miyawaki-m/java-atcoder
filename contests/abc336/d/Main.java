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
        int maxPyramidSize = 1;
        for (int center = 0; center < A.length; center++) {
            int leftSize = 1, rightSize = 1;
            int value = A[center];

            // 中心から左側を確認
            for (int i = center - 1; i >= 0 && A[i] < value; i--) {
                leftSize++;
                value = A[i];
            }

            value = A[center];
            // 中心から右側を確認
            for (int i = center + 1; i < A.length && A[i] < value; i++) {
                rightSize++;
                value = A[i];
            }

            // 中心を含むピラミッドのサイズを計算
            int pyramidSize = Math.min(leftSize, rightSize);
            maxPyramidSize = Math.max(maxPyramidSize, pyramidSize);
        }
        return maxPyramidSize;
    }
}
