package cro.정수론;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class P21568_확장유클리드 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int a = Integer.parseInt(stringTokenizer.nextToken());
        int b = Integer.parseInt(stringTokenizer.nextToken());
        int c = Integer.parseInt(stringTokenizer.nextToken());

        long gcd = gcd(a, b);

        if(c % gcd != 0) {
            System.out.println(-1);
        } else {
            int mok = (int)(c / gcd);
            long ret[] = Excute(a, b);
            System.out.println(ret[0] * mok + " " + ret[1] * mok);
        } // if - else
    } // class

    private static long Excute(long a, long b)[] {
        long ret[] = new long[2];

        if(b == 0) {
            ret[0] = 1;
            ret[1] = 0;
            return ret;
        } // if

        long q = a / b;
        long v[] = Excute(b, a % b);
        ret[0] = v[1];
        ret[1] = v[0] - v[1] * q;

        return ret;
    } // Excute(a, b)

    private static long gcd(long a, long b) {
        while (b != 0) {
            long temp = a % b;
            a = b;
            b = temp;
        } // while
        return Math.abs(a);
    } // gcd(a, b)
} // class
