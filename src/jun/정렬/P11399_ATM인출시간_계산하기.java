package jun.정렬;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P11399_ATM인출시간_계산하기 {

    public static void main(String[] args) throws Exception {
        int n = input.integer();
        int[] array = new int[n];

        for (int index = 0; index < n; index++) {
            array[index] = input.integer();
        }

        Arrays.sort(array);

        int sum = 0;
        for (int index = 0; index < n; index++) {
            sum += array[index] * (n - index);
        }
        System.out.println(sum);
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
