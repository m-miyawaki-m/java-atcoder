import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); // ユーザーの数
        int M = scanner.nextInt(); // 既存の友達関係の数

        List<Set<Integer>> friends = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            friends.add(new HashSet<>()); // 各ユーザーの友達リストを初期化
        }

        for (int i = 0; i < M; i++) {
            int A = scanner.nextInt() - 1; // 0-indexed
            int B = scanner.nextInt() - 1; // 0-indexed
            friends.get(A).add(B);
            friends.get(B).add(A);
        }

        int newFriendships = 0;

        // Loop through each user to explore new friendships
        for (int i = 0; i < N; i++) {
            Set<Integer> alreadyCounted = new HashSet<>();
            for (int friend : friends.get(i)) {
                for (int fof : friends.get(friend)) {
                    if (fof != i && !friends.get(i).contains(fof) && !alreadyCounted.contains(fof)) {
                        alreadyCounted.add(fof);
                        newFriendships++;
                    }
                }
            }
        }

        System.out.println(newFriendships);
        scanner.close();
    }
}
