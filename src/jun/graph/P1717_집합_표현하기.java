package jun.graph;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1717_집합_표현하기 {
    static int n, m;

    static int[] parent;

    public static void main(String[] args) throws Exception {
        n = input.integer();
        m = input.integer();
        parent = new int[n + 1];

        for (int index = 1; index <= n; index++) {
            parent[index] = index;
        }

        for (int index = 0; index < m; index++) {
            int question = input.integer();
            int x = input.integer();
            int y = input.integer();
            if (question == 0) {
                union(x, y);
            } else {
                if (check(x, y)) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }

    static int find(int x) {
        if (x == parent[x]) return x;
        return parent[x] = find(parent[x]);
    }

    static void union(int x, int y) {
        x = find(x);
        y = find(y);
        if (x != y) {
            parent[y] = x;
        }
    }

    static boolean check(int x, int y) {
        x = find(x);
        y = find(y);
        if (x == y) return true;
        return false;
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
