import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();
        System.out.println(findMaxPalindromeCube(N));
    }

    private static long findMaxPalindromeCube(long N) {
        long maxPalindromeCube = -1;
        for (long i = 1; i * i * i <= N; i++) {
            long cube = i * i * i;
            if (isPalindrome(cube)) {
                maxPalindromeCube = cube; // 回文である立方数を更新
            }
        }
        return maxPalindromeCube;
    }

    private static boolean isPalindrome(long number) {
        String str = Long.toString(number);
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left++) != str.charAt(right--)) {
                return false;
            }
        }
        return true;
    }
}
