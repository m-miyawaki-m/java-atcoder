import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());
        int[] nums = Arrays.stream(scanner.nextLine().split(" "))
        .mapToInt(Integer::parseInt)
        .toArray();

        // 累積和の配列を作成
        int[] cumSum = new int[N];
        cumSum[0] = nums[0]==1 ? 1 : 0;
        for (int i = 1; i < N; i++) {
            cumSum[i] = cumSum[i - 1] + (nums[i]==1 ? 1 : 0);
        }

        int Q = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < Q; i++) {
            // 区間の始点と終点を入力として受け取る
            int start = scanner.nextInt()-1;
            int end = scanner.nextInt()-1;

            // 区間内で1の方が多いか0の方が多いか、または同じかを判定
            int oneCount = start == 0 ? cumSum[end] : cumSum[end] - cumSum[start - 1];
            int zeroCount = (end - start + 1) - oneCount;

            if (oneCount > zeroCount) {
                System.out.println("win");
            } else if (oneCount < zeroCount) {
                System.out.println("lose");
            } else {
                System.out.println("draw");
            }
        }

        scanner.close();
    }
}
