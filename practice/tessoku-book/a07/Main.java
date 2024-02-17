import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int D = scanner.nextInt(); // 整数 D を入力として受け取る
        int N = scanner.nextInt(); // 整数 N を入力として受け取る

        // D日間のイベント
        int[] nums = new int[D];

        for (int i = 0; i < N; i++) {
            int L = scanner.nextInt() - 1;
            int R = scanner.nextInt() - 1;

            for(int j=L; j<=R; j++){
                nums[j]++;
            }
        }

        // 最終的な結果を出力
        for(int num : nums){
           System.out.println(num);
        }
        scanner.close();
    }
}
