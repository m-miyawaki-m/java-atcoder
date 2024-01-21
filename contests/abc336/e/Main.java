import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();
        scanner.close();

        long count = 0;
        for (long i = 1; i <= N; i++) {
            if (i % digitSum(i) == 0) {
                count++;
            }
        }

        System.out.println(count);
    }

    private static int digitSum(long n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10; // 最下位の桁を加える
            n /= 10;       // 次の桁へ移動
        }
        return sum;
    }
}