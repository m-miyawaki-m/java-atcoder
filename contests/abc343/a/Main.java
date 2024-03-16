import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // 頂点の数 N を入力
        scanner.nextLine(); // 次の行へ移動

        for (int i = 0; i < N; i++) {
            String[] line = scanner.nextLine().replace("_", " ").split(" ");
            for (int j = 0; j < N; j++) {
                if (line[j].equals("1")) {
                    // 頂点番号は1から始まるため、インデックスに1を加えて出力
                    System.out.print((j + 1) + " ");
                }
            }
            System.out.println(); // 各頂点の出力の後に改行
        }

        scanner.close();
    }
}
