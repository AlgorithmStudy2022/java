package jun;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int[] numbers;
    static int[] compileSum;

    public static void main(String[] args) throws Exception {
        int n = input.integer();
        int m = input.integer();
        numbers = new int[n + 1];
        compileSum = new int[n + 1];

        for (int index = 1; index <= n; index++) {
            numbers[index] = input.integer();
        }

        compileSum[0] = 0;
        for (int index = 1; index <= n; index++) {
            compileSum[index] = compileSum[index - 1] + numbers[index];
        }

        for (int index = 0; index < m; index++) {
            int start = input.integer();
            int end = input.integer();
            System.out.print(add(start, end) + " ");
        }
    }

    static int add(int start, int end) {
        return compileSum[end] - compileSum[start - 1];
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
