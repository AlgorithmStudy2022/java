package jun.자료구조;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11660_구간_합_구하기2 {
    public static void main(String[] args) throws Exception {
        int n = input.integer();
        int m = input.integer();

        int[][] score = new int[n + 1][n + 1];
        int[][] dp = new int[n + 1][n + 1];

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                score[i][j] = input.integer();
            }
        }

        int sum = 0;
//
//        for(int i = 1; i <= n; i++) {
//            for(int j = 1; j <= n; j++) {
//                dp[i][j] = dp[i-1][j] + dp[i][j-1] - dp[i-1][j-1] + arr[i][j];
//            }
//        }


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
