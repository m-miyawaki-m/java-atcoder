import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt(); // 整数 T を入力として受け取る
        int N = scanner.nextInt(); // 整数 N を入力として受け取る

        // D日間のイベント
        int[] nums = new int[T];

        int[] diff = new int[T+1]; // T+1 で初期化しておく（RがTと等しい場合のため）

        for (int i = 0; i < N; i++) {
            int L = scanner.nextInt();
            int R = scanner.nextInt();
        
            diff[L]++;
            if (R < T) diff[R]--;
        }
        
        // 累積和を計算してnumsに格納
        int sum = 0;
        for (int i = 0; i < T; i++) {
            sum += diff[i];
            nums[i] = sum;
        }

        // 最終的な結果を出力
        for(int num : nums){
           System.out.println(num);
        }
        scanner.close();
    }
}