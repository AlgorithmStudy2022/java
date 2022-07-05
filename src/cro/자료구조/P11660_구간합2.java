package cro.자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11660_구간합2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int count = Integer.parseInt(stringTokenizer.nextToken());
        int question = Integer.
                parseInt(stringTokenizer.nextToken());

        int A[][] = new int[count + 1][count + 1];
        for(int i = 1; i <= count; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            for(int j = 1; j <= count; j++) {
                A[i][j] = Integer.parseInt(stringTokenizer.nextToken());
            } // inner for
        } // outer for

        int D[][] = new int[count + 1][count + 1];
        for(int i = 1; i <= count; i++) {
            for(int j = 1; j <= count; j++) {
                D[i][j] = D[i][j - 1] + D[i - 1][j] - D[i - 1][j - 1] + A[i][j];
            } // inner for
        } // outer for

        for(int i = 0; i < question; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int x1 = Integer.parseInt(stringTokenizer.nextToken());
            int y1 = Integer.parseInt(stringTokenizer.nextToken());
            int x2 = Integer.parseInt(stringTokenizer.nextToken());
            int y2 = Integer.parseInt(stringTokenizer.nextToken());

            int result = D[x2][y2] - D[x1 - 1][y2] - D[x2][y1 - 1] + D[x1 - 1][y1 - 1];
            System.out.println(result);
        } // for
    } // main
} // public class
