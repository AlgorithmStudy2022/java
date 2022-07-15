package jun.greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P1931_회의실_배정하기 {

    static int n;
    static Node[] nodes;

    public static void main(String[] args) throws Exception {
        n = input.integer();
        nodes = new Node[n];

        for (int index = 0; index < n; index++) {
            int start = input.integer();
            int end = input.integer();
            nodes[index] = new Node(start, end);
        }

        Arrays.sort(nodes);

        int count = 0;
        int prevEndTime = 0;
        for (int index = 0; index < n; index++) {
            Node currentNode = nodes[index];
            if (prevEndTime <= currentNode.start) {
                prevEndTime = currentNode.end;
                count++;
            }
        }

        System.out.println(count);
    }

    static class Node implements Comparable<Node> {
        int start, end;

        public Node(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public int compareTo(Node o) {
            if(this.end == o.end){
                return this.start - o.start;
            }
            return this.end - o.end;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "start=" + start +
                    ", end=" + end +
                    '}';
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
