package jun.theoryofnumbers;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1747_소수_팰린드롬 {
    static boolean[] primes;

    public static void main(String[] args) throws Exception {
        int n = input.integer();
        primes = new boolean[1004001];

        checkPrime();

        for (int index = n; index < primes.length; index++) {
            if (primes[index] && isPalindrome(index)) {
                System.out.println(index);
                return;
            }
        }
    }

    public static boolean isPalindrome(int n) {
        String num = Integer.toString(n);
        for (int i = 0; i <= num.length() / 2; i++) {
            if (num.charAt(i) != num.charAt(num.length() - i - 1)) return false;
        }
        return true;
    }

    private static void checkPrime() {

        for (int i = 2; i <= 1004000; i++) {
            primes[i] = true;
        }
        primes[1] = false;
        int num = (int) Math.sqrt(1004000);

        for (int i = 2; i <= num; i++) {
            if (primes[i]) {
                for (int j = i; i * j <= 1004000; j++) {
                    primes[i * j] = false;
                }
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
