package jun.graph;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class P18352_특정_거리의_도시_찾기 {
    static int n, m, k, x;
    static List<Edge>[] edges;
    static final int MAX = Integer.MAX_VALUE;
    static int[] dist;

    public static void main(String[] args) throws Exception {
        n = input.integer();
        m = input.integer();
        k = input.integer();
        x = input.integer();

        dist = new int[n + 1];
        edges = new ArrayList[n + 1];
        Arrays.fill(dist, MAX);

        for (int i = 1; i <= n; i++) {
            edges[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            int start = input.integer();
            int end = input.integer();
            edges[start].add(new Edge(end, 1));
        }
        dist[x] = 0;
        dijkstra();

        int answer = 0;
        for (int i = 1; i < dist.length; i++) {
            int distance = dist[i];
            if (distance == k) {
                System.out.println(i);
                answer++;
            }
        }
        if (answer == 0) System.out.println(-1);
    }

    private static void dijkstra() {
        PriorityQueue<Edge> queue = new PriorityQueue<>();
        queue.add(new Edge(x, 0));
        while (!queue.isEmpty()) {
            Edge edge = queue.poll();
            int vertex = edge.vertex;
            int cost = edge.cost;
            if (dist[vertex] < cost) {
                continue;
            }
            for (int i = 0; i < edges[vertex].size(); i++) {
                int vertex2 = edges[vertex].get(i).vertex;
                int cost2 = edges[vertex].get(i).cost + cost;
                if (dist[vertex2] > cost2) {
                    dist[vertex2] = cost2;
                    queue.add(new Edge(vertex2, cost2));
                }
            }
        }
    }

    private static class Edge implements Comparable<Edge> {
        int vertex;
        int cost;

        public Edge(int vertex, int cost) {
            this.vertex = vertex;
            this.cost = cost;
        }

        @Override
        public int compareTo(Edge o) {
            return cost - o.cost;
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

