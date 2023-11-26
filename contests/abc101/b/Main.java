import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 整数 N を入力として受け取る
        int N = scanner.nextInt();

        // N の各桁の和 S(N) を計算する
        int sum = 0;
        int temp = N;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }

        // N が S(N) で割り切れるか判定し、結果を出力する
        if (N % sum == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}