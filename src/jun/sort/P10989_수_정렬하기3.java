package jun.sort;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P10989_수_정렬하기3 {
    public static void main(String[] args) throws Exception {
        int n = input.integer();
        int max = 0;
        int[] array = new int[n];
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = input.integer();
            max = Math.max(array[i], max);
        }

        int[] countingArray = new int[max + 1];

        for (int j : array) {
            countingArray[j]++;
        }

        for (int i = 1; i < countingArray.length; i++) {
            countingArray[i] += countingArray[i - 1];
        }

        for (int i = array.length - 1; i >= 0; i--) {
            result[--countingArray[array[i]]] = array[i];
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(result[i]).append("\n");
        }
        System.out.println(sb);
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
