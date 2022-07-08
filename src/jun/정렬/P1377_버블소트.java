package jun.정렬;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P1377_버블소트 {
    public static void main(String[] args) throws Exception {
        int n = input.integer();
        Point[] points = new Point[n + 1];
        for (int i = 1; i <= n; i++) {
            int temp = input.integer();
            points[i] = new Point(temp, i);
        }

        Arrays.sort(points, 1, n + 1);

        int max = 0;
        for (int i = 1; i <= n; i++) {
            max = Math.max(max, points[i].index - i);
        }
        System.out.println(max + 1);
    }

    static class Point implements Comparable<Point> {
        int value;
        int index;

        public Point(int value, int index) {
            this.value = value;
            this.index = index;
        }

        @Override
        public int compareTo(Point o) {
            return this.value - o.value;
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
