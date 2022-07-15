package jun.theoryofnumbers;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class P1456_거의_소수 {

    static List<Integer> primes = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        int start = input.integer();
        int end = input.integer();

        for (int index = start; index <= end; index++) {
            if (isPrime(index)) primes.add(index);
        }

        int result = 0;
        for (int index = start; index <= end; index++) {
            System.out.println();
            if (primes.contains((int) Math.pow(index, 2))) {
                result++;
            }
        }
        System.out.println(result);
    }

    public static boolean isPrime(int number) {
        if (number < 2) return false;
        for (int index = 2; index < Math.sqrt(number); index++) {
            if (number % index == 0) return false;
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
    }
}
