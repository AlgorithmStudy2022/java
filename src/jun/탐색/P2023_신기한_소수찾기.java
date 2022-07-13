package jun.탐색;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2023_신기한_소수찾기 {

    private static final StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        int n = input.integer();
        getAnswer(0, n);
        System.out.println(sb);
    }

    public static void getAnswer(int output, int n) {
        if (n == 0) {
            if (isPrime(output)) sb.append(output).append("\n");
        }
        for (int i = 0; i < 10; i++) {
            int next = output * 10 + i;
            if (isPrime(next)) getAnswer(next, n - 1);
        }
    }

    public static boolean isPrime(int number) {
        if (number < 2) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
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
