package jun.탐색;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11724_연결_요소의_개수_구하기 {
    static boolean[] visited;
    static int n;
    static int m;
    static int[][] adj;

    public static void main(String[] args) throws Exception {
        n = input.integer();
        m = input.integer();
        adj = new int[n + 1][n + 1];
        visited = new boolean[n + 1];

        for (int index = 0; index < m; index++) {
            int start = input.integer();
            int end = input.integer();
            adj[start][end] = 1;
            adj[end][start] = 1;
        }

        int count = 0;
        for (int index = 1; index < n + 1; index++) {
            if (!visited[index]) {
                dfs(index);
                count++;
            }
        }

        System.out.println(count);
    }

    private static void dfs(int index) {
        visited[index] = true;
        for (int i = 1; i < n + 1; i++) {
            if (adj[index][i] == 1 && !visited[i]) {
                dfs(i);
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
