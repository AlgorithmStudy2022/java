package gdakate.자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class P11660_구간합구하기2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] s= new int[N][N];
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(j==0)
                    s[i][j]=Integer.parseInt(st.nextToken());
                else
                    s[i][j]=s[i][j-1]+Integer.parseInt(st.nextToken());
            }
        }

        for(int p=0;p<=M;p++) {
            int x1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            int sum = 0;

            for (int i = x1; i <= x2; i++) {
                sum += s[i][y2] - s[i][y1 - 1];
            }
            System.out.println(sum);
        }
    }

}
