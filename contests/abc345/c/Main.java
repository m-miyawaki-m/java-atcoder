import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.next();
        char[] charArray = inputString.toCharArray();
        int stringLength = charArray.length;
        int[] charFrequency = new int[26]; // 各文字の出現頻度を格納する配列

        // 各文字の出現頻度を計算
        for (int i = 0; i < stringLength; i++) {
            charFrequency[charArray[i] - 'a']++;
        }

        long totalSwaps = 0L; // 交換の総数
        int hasDuplicates = 0; // 重複する文字があるかどうかのフラグ

        // 交換の総数を計算
        for (int i = 0; i < stringLength; i++) {
            totalSwaps += stringLength - i - (--charFrequency[charArray[i] - 'a']) - 1;
            if (charFrequency[charArray[i] - 'a'] > 0)
                hasDuplicates = 1; // 重複する文字がある場合、フラグをセット
        }

        // 重複する文字がある場合は1を加算して出力
        System.out.println(totalSwaps + hasDuplicates);
        scanner.close();
    }
}
