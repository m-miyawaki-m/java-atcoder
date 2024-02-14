import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 文字列 S を入力として受け取る
        String[] strings = scanner.next().split("");

        // 累積和の配列を作成
        int[] cumSum = new int[strings.length];
        cumSum[0] = strings[0].equals("1") ? 1 : 0;
        for (int i = 1; i < strings.length; i++) {
            cumSum[i] = cumSum[i - 1] + (strings[i].equals("1") ? 1 : 0);
        }

        // 区間の始点と終点を入力として受け取る
        int start = scanner.nextInt()-1;
        int end = scanner.nextInt()-1;

        // 区間の合計値を計算
        int rangeSum = cumSum[end] - (start == 0 ? 0 : cumSum[start - 1]);

        String result = "draw";
        // 区間内で1の方が多いか0の方が多いか、または同じかを判定
        int rangeLength = end - start + 1;
        if (rangeSum > rangeLength / 2) {
            result = "Win";
        } else if (rangeSum == rangeLength / 2) {
            result = "Draw";
        } else {
            result = "Lose";
        }
        System.out.println(result);
        scanner.close();
    }
}
