import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        long A = scanner.nextLong();
        long B = scanner.nextLong();
        long cycle = A + B;

        long x0 = scanner.nextLong(); // 最初の予定を基準とする

        long maxd = 0; // 最大の相対距離
        long mind = Long.MAX_VALUE; // 最小の相対距離、初期値を最大に

        for (int i = 1; i < N; i++) {
            long xi = scanner.nextLong() - x0; // 最初の予定からの相対位置
            long ri = xi % cycle; // 周期内での相対位置

            if (ri >= A) {
                ri -= cycle; // 休日の範囲外であれば周期を引いて調整
            }

            if (ri > maxd) {
                maxd = ri; // 最大の相対距離を更新
            }
            if (ri < mind) {
                mind = ri; // 最小の相対距離を更新
            }
        }

        // すべての予定が休日期間に収まるかどうかを判断
        String result = (maxd - mind < A) ? "Yes" : "No";
        System.out.println(result);

        scanner.close();
    }
}
