package jun.search;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P2178_미로_탐색하기 {
    static int n;
    static int m;
    static int[][] maze;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    public static void main(String[] args) throws Exception {
        n = input.integer();
        m = input.integer();
        maze = new int[n][m];
        for (int row = 0; row < n; row++) {
            String s = input.br.readLine();
            for (int col = 0; col < m; col++) {
                maze[row][col] = s.charAt(col) - '0';
            }
        }

        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(0, 0));
        while (!queue.isEmpty()) {
            Point point = queue.poll();
            for (int index = 0; index < 4; index++) {
                int nextX = point.x + dx[index];
                int nextY = point.y + dy[index];
                if (moveable(nextX, nextY)) {
                    maze[nextX][nextY] = maze[point.x][point.y] + 1;
                    queue.add(new Point(nextX, nextY));
                }
            }
        }
        System.out.println(maze[n - 1][m - 1]);
    }

    public static boolean moveable(int x, int y) {
        return x >= 0 && x < n && y >= 0 && y < m && maze[x][y] == 1;
    }

    static class Point {
        int x, y;

        public Point(int x, int y) {
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
