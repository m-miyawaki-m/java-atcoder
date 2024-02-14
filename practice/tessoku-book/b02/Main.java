import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();

        String result = "No";
        if (method02(A, B)) {
            result = "Yes";
        }

        System.out.println(result);
        scanner.close();
    }
    public static boolean method01(int a,int b){
        b = Math.min(b, 100);
        return IntStream.rangeClosed(a,b).anyMatch(num -> 100 % num == 0);
    }
    public static boolean method02(int a, int b) {
        // 100までの約数を配列に格納
        int[] divisors = IntStream.rangeClosed(1, 100).filter(num -> 100 % num == 0).toArray();
    
        // aからbまでの間に配列内の数字が存在するか判定
        return IntStream.rangeClosed(a, b).anyMatch(num -> Arrays.stream(divisors).anyMatch(divisor -> divisor == num));
    }
}
