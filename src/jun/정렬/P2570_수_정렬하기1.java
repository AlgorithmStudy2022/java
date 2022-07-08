package jun.정렬;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P2570_수_정렬하기1 {
    public static void main(String[] args) throws Exception {
        int n = input.integer();
        int[] array = new int[n];
        for (int index = 0; index < n; index++) {
            array[index] = input.integer();
        }
        Arrays.sort(array);

        for (int index = 0; index < n; index++) {
            System.out.println(array[index]);
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
