package jun.search;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class P13023_친구_관계_파악하기 {

    static int n;
    static int m;
    static List<Integer>[] relationships;
    static boolean[] visited;

    public static void main(String[] args) throws Exception {
        n = input.integer();
        m = input.integer();

        relationships = new ArrayList[n];

        for (int index = 0; index < n; index++) {
            relationships[index] = new ArrayList<>();
        }

        for (int index = 0; index < m; index++) {
            int friendA = input.integer();
            int friendB = input.integer();

            relationships[friendA].add(friendB);
            relationships[friendB].add(friendA);
        }

        for (int person = 0; person < n; person++) {
            visited = new boolean[n];
            dfs(person, 0);
        }
        System.out.println(0);
    }

    private static void dfs(int person, int relationshipCount) {
        if (relationshipCount == 4) {
            System.out.println(1);
            System.exit(0);
        }
        visited[person] = true;
        for (int index = 0; index < relationships[person].size(); index++) {
            int friend = relationships[person].get(index);
            if (!visited[friend]) {
                visited[friend] = true;
                dfs(friend, relationshipCount + 1);
                visited[friend] = false;
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
