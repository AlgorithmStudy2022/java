package jun.greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11047_동전0 {
    static int[] array;

    public static void main(String[] args) throws Exception {
        int n = input.integer();
        array = new int[n];
        int k = input.integer();

        for (int index = n - 1; index >= 0; index--) {
            array[index] = input.integer();
        }

        int count = 0;

        for (int index = 0; index < n; index++) {
            int c = k / array[index];
            count += c;
            k -= (c) * array[index];
            if (k == 0) {
                System.out.println(count);
                return;
            }
        }

    }

    static Input input = new Input();

    static class Input {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        public int integer() throws Exception {
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
