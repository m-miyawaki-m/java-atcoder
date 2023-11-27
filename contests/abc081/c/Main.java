import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // N と K を読み込む
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        // 各整数の出現回数を記録
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int i = 0; i < N; i++) {
            int number = scanner.nextInt();
            frequencyMap.put(number, frequencyMap.getOrDefault(number, 0) + 1);
        }
        scanner.close();

        // 出現回数が少ないものから優先度キューに入れる
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> frequencyMap.get(a) - frequencyMap.get(b));
        pq.addAll(frequencyMap.keySet());

        // 出現回数が少ないものから削除し、K種類を超えるまで続ける
        int changesNeeded = 0;
        while (pq.size() > K) {
            int leastFrequent = pq.poll();
            changesNeeded += frequencyMap.get(leastFrequent);
        }

        System.out.println(changesNeeded);
    }
}
