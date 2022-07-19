package jun.search;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P1206_DFS와_BFS {

    static int[][] relationship;
    static boolean[] visited;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static StringBuilder sb = new StringBuilder();
    static int n;
    static int m;
    static int v;

    public static void main(String[] args) throws Exception {

        n = input.integer();
        m = input.integer();
        v = input.integer();

        relationship = new int[n][n];
        visited = new boolean[n];

        for (int index = 0; index < m; index++) {
            int x = input.integer();
            int y = input.integer();
            relationship[x - 1][y - 1] = 1;
            relationship[y - 1][x - 1] = 1;
        }

        dfs(v - 1);

        for (int index = 0; index < n; index++) {
            visited[index] = false;
        }

        sb.append("\n");
        bfs(v - 1);
        System.out.println(sb);

    }

    private static void dfs(int node) {
        visited[node] = true;
        sb.append((node + 1) + " ");
        for (int index = 0; index < n; index++) {
            if (!visited[index] && relationship[node][index] == 1) {
                dfs(index);
            }
        }
    }

    static void bfs(int node) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(node);
        visited[node] = true;
        sb.append(node + 1 + " ");
        while (!queue.isEmpty()) {
            int temp = queue.poll();
            for (int index = 0; index < n; index++) {
                if (!visited[index] && relationship[temp][index] == 1) {
                    queue.add(index);
                    visited[index] = true;
                    sb.append(index + 1 + " ");
                }
            }
        }
    }

    static boolean moveable(int x, int y) {
        return x >= 0 && x < n && y >= 0 && y < n && !visited[x] && relationship[x][y] == 1;
    }

    static class Node {
        int x, y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
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
