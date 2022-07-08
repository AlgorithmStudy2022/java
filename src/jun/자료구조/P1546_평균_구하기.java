package jun.자료구조;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1546_평균_구하기 {
    public static void main(String[] args) throws Exception {
        int n = input.integer();
        float[] record = new float[n];
        float max = 0;
        float avg = 0;

        for (int i = 0; i < record.length; i++) {
            record[i] = input.integer();
            if (record[i] > max) {
                max = record[i];
            }
        }

        for (int j = 0; j < record.length; j++) {
            avg += (record[j] / max * 100);
        }
        System.out.println(avg / n);
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
