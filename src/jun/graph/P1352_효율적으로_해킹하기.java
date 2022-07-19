package jun.graph;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class P1352_효율적으로_해킹하기 {
    static int n;
    static int m;
    static Computer[] computers;
    static boolean[] visited;
    static int[] answer;

    public static void main(String[] args) throws Exception {
        n = input.integer();
        m = input.integer();

        visited = new boolean[n];
        answer = new int[n];
        computers = new Computer[n];

        for (int index = 0; index < n; index++) {
            computers[index] = new Computer(index);
        }

        for (int index = 0; index < m; index++) {
            int start = input.integer();
            int end = input.integer();
            computers[end - 1].adj.add(computers[start - 1]);
        }

        for (int index = 0; index < n; index++) {
            visited = new boolean[n];
            visited[index] = true;
            dfs(index, index);
        }

        int max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, answer[i]);
        }
        StringBuilder sb = new StringBuilder();
        for (int index = 0; index < n; index++) {
            if (max == answer[index]) {
                sb.append(index + 1).append(" ");
            }
        }
        System.out.println(sb);


    }

    private static void dfs(int start, int now) {
        for (Computer computer : computers[now].adj) {
            if (!visited[computer.index]) {
                visited[computer.index] = true;
                dfs(start, computer.index);
                answer[start]++;
            }
        }
    }

    static class Computer {
        int index;
        List<Computer> adj;

        public Computer(int index) {
            this.index = index;
            this.adj = new ArrayList<>();
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
