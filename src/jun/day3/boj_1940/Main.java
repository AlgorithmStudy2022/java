package jun.day3.boj_1940;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int[] material;

    public static void main(String[] args) throws Exception {
        int n = input.integer();
        int m = input.integer();
        material = new int[n + 1];

        for (int index = 0; index < n; index++) {
            material[index] = input.integer();
        }

        Arrays.sort(material);

        int left = 0;
        int right = material.length - 1;
        int answer = 0;
        while (left < right) {
            if (material[left] + material[right] == m) {
                answer++;
                left++;
                right--;
            } else if (material[left] + material[right] < m) {
                left++;
            } else {
                right--;
            }
        }
        System.out.println(answer);


        //solution1(n, m);
    }

    private static void solution1(int n, int m) {
        int answer = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (material[i] + material[j] == m) {
                    answer++;
                }
            }
        }
        System.out.println(answer);
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
