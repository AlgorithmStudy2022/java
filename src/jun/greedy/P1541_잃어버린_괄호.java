package jun.greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1541_잃어버린_괄호 {
    public static void main(String[] args) throws Exception {
        String[] cal = input.br.readLine().split("-");
        int result = 0;

        for (int index = 0; index < cal.length; index++) {
            int sum = 0;
            String[] subCal = cal[index].split("\\+");
            for (int j = 0; j < subCal.length; j++) {
                sum += Integer.parseInt(subCal[j]);
            }
            if (index == 0) {
                result += sum;
            } else {
                result -= sum;
            }
        }
        System.out.println(result);
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

        public long getLong() throws Exception {
            if (!st.hasMoreElements()) st = new StringTokenizer(br.readLine());
            return Integer.parseInt(st.nextToken());
        }
    }
}
