package cro.정수론;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class P1850_최대공약수 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        long a = sc.nextLong();
        long b = sc.nextLong();
        long result = gcd(a, b);

        try(bufferedWriter) {
            while(result > 0) {
                bufferedWriter.write("1");
                result--;
            } // while
            bufferedWriter.flush();
        } // try - resource

    } // main

    private static long gcd(long a, long b) {
        if(b == 0)
            return a;
        else
            return gcd(b, a % b);
    } // gcd()
} // class
