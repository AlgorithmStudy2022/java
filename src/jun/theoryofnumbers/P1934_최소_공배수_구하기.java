package jun.theoryofnumbers;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1934_최소_공배수_구하기 {
    public static void main(String[] args) throws Exception {
        int n = input.integer();

        for (int index = 0; index < n; index++) {
            int numberA = input.integer();
            int numberB = input.integer();

            int result = (numberA * numberB) / gcd(numberA, numberB);
            System.out.println(result);
        }
    }

    // 최대공약수
    public static int gcd(int a, int b) {
        int big = a - b > 0 ? a : b;
        int small = big == a ? b : a;

        int r;
        while (small > 0) {
            r = big % small;
            big = small;
            small = r;

        }
        return big;
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
    }
}
