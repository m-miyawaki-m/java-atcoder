import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int Q = Integer.parseInt(st.nextToken());

        long[] A = new long[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Long.parseLong(st.nextToken());
        }

        for (int q = 0; q < Q; q++) {
            st = new StringTokenizer(br.readLine());
            int type = Integer.parseInt(st.nextToken());
            if (type == 1) {
                // タイプ1のクエリ: A[p]の値をxに変更
                int p = Integer.parseInt(st.nextToken()) - 1; // 0-based index
                long x = Long.parseLong(st.nextToken());
                A[p] = x;
            } else if (type == 2) {
                // タイプ2のクエリ: (Al, Al+1, ..., Ar)において2番目に大きい値の個数を出力
                int l = Integer.parseInt(st.nextToken()) - 1; // 0-based index
                int r = Integer.parseInt(st.nextToken()) - 1; // 0-based index
                System.out.println(countSecondLargest(A, l, r));
            }
        }
    }

    private static int countSecondLargest(long[] A, int l, int r) {
        long max = Long.MIN_VALUE;
        long secondMax = Long.MIN_VALUE;
        Map<Long, Integer> countMap = new HashMap<>();

        for (int i = l; i <= r; i++) {
            countMap.put(A[i], countMap.getOrDefault(A[i], 0) + 1);
            if (A[i] > max) {
                secondMax = max;
                max = A[i];
            } else if (A[i] > secondMax && A[i] < max) {
                secondMax = A[i];
            }
        }

        return countMap.getOrDefault(secondMax, 0);
    }
}
