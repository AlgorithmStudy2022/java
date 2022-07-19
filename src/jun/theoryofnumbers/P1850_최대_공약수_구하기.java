package jun.theoryofnumbers;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1850_최대_공약수_구하기 {

    static final StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        long numberA = input.integer();
        long numberB = input.integer();
        int gcd = ((int) gcd(numberA, numberB));

        for (int index = 0; index < gcd; index++) {
            sb.append("1");
        }
        System.out.println(sb);
    }

    public static long gcd(long numberA, long numberB) {
        long big = numberA - numberB > 0 ? numberA : numberB;
        long small = numberA == big ? numberB : numberA;

        long r;
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

        public long integer() throws Exception {
            if (!st.hasMoreElements()) st = new StringTokenizer(br.readLine());
            return Long.parseLong(st.nextToken());
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
