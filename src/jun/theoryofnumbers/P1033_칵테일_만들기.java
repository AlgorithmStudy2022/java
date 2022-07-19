package jun.theoryofnumbers;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class P1033_칵테일_만들기 {

    static int count;
    static long[] numbers;
    static List<ArrayList<Integer>> edge = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        count = input.integer();
        numbers = new long[count];

        for (int index = 0; index < count; index++) {
            edge.add(new ArrayList<>());
            numbers[index] = 1;
        }

        for (int index = 0; index < count - 1; index++) {
            int a, b;
            long p, q;
            a = input.integer();
            b = input.integer();
            p = input.getLong();
            q = input.getLong();
            long gcd = getGCD(p, q);
            calculate(a, b, p / gcd, q / gcd);
        }

        setNums();

        for (int i = 0; i < count; i++)
            System.out.print(numbers[i] + " ");
    }

    private static void setNums() {
        long gcd = getGCD(numbers[0], numbers[1]);
        while (gcd > 1) {
            for (int i = 0; i < count; i++)
                gcd = getGCD(gcd, numbers[i]);
            for (int i = 0; i < count; i++)
                numbers[i] /= gcd;
        }
    }

    private static void calculate(int a, int b, long p, long q) {
        Boolean[] check = new Boolean[count + 5];
        long tempA = numbers[a];
        long tempB = numbers[b];
        update(a, tempB * p, check);
        update(b, tempA * q, check);
        edge.get(a).add(b);
        edge.get(b).add(a);
    }

    private static void update(int target, long num, Boolean[] check) {
        numbers[target] *= num;
        check[target] = true;
        for (int i = 0; i < edge.get(target).size(); i++) {
            if (check[edge.get(target).get(i)] != null) continue;
            update(edge.get(target).get(i), num, check);
        }
    }

    private static long getGCD(long a, long b) {
        while (b > 0) {
            long temp = a;
            a = b;
            b = temp % b;
        }
        return a;
    }

    static Input input = new Input();

    static class Input {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        public long getLong() throws Exception {
            if (!st.hasMoreElements()) st = new StringTokenizer(br.readLine());
            return Long.parseLong(st.nextToken());
        }

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
