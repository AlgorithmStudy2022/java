package jun.graph;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class P1707_이분_그래프_판별하기 {
    public static void dfs(List<Integer>[] a, int[] color, int x, int c) {
        color[x] = c;
        for (int y : a[x]) {
            if (color[y] == 0) {
                dfs(a, color, y, 3 - c);
            }
        }
    }

    public static void main(String[] args) throws Exception {
        int t = input.integer();

        while (t-- > 0) {
            int n = input.integer();
            int m = input.integer();

            List<Integer>[] a = new ArrayList[n + 1];

            for (int i = 1; i <= n; i++) {
                a[i] = new ArrayList();
            }

            for (int i = 0; i < m; i++) {
                int nodeA = input.integer();
                int nodeB = input.integer();
                a[nodeA].add(nodeB);
                a[nodeB].add(nodeA);
            }

            int[] color = new int[n + 1];

            boolean ok = true;
            for (int i = 1; i <= n; i++) {
                if (color[i] == 0)
                    dfs(a, color, i, 1);
            }

            for (int i = 1; i <= n; i++) {
                for (int j : a[i]) {
                    if (color[i] == color[j]) {
                        ok = false;
                        break;
                    }
                }
            }

            if (ok) {
                System.out.println("YES");
            } else
                System.out.println("NO");
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
    }
}
