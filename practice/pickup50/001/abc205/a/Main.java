import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        float a = s.nextInt();
        float b = s.nextInt();
        float res = a / (10 * 10) * b;

        if (res == (int) res) {
            // 結果が整数の場合は小数点以下を表示しない
            System.out.printf("%.0f\n", res);
        } else {
            // 結果が小数の場合は小数点以下も表示する
            System.out.println(res);
        }
    }
}
