package jun.search;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1300_배열에서_K번째_수_찾기 {

    static long n, k;
    static long result;

    public static void main(String[] args) throws Exception {
        n = input.inputLong();
        k = input.inputLong();

        long left = 1;
        long right = k;

        System.out.println(binarySearch(left, right));
    }

    static long binarySearch(long left, long right) {
        int count = 0;
        long mid = (left + right) / 2;
        if (left > right) return result;

        for (int index = 1; index < n; index++) {
            count += Math.min(mid / index, n);
        }
        if (k <= count) {
            result = mid;
            return binarySearch(left, mid - 1);
        }
        return binarySearch(mid + 1, right);
    }

    static Input input = new Input();

    static class Input {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        public long inputLong() throws Exception {
            if (!st.hasMoreElements()) st = new StringTokenizer(br.readLine());
            return Integer.parseInt(st.nextToken());
        }

        public String next() throws Exception {
            if (!st.hasMoreElements()) st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }

        public char[] nToCharArray() throws Exception {
            if (!st.hasMoreElements()) st = new StringTokenizer(br.readLine());
            return st.nextToken().toCharArray();
        }
    }
}
