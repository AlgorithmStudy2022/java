package cro.정수론;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P11689_오일러피 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        long n = Long.parseLong(bufferedReader.readLine());
        long result = n;

        for(long p = 2; p * p <= n; p++) {

            if(n % p == 0) { // p가 소수이면
                result = result - result / p; // 결과값 업데이트
                while(n % p == 0) { //
                    n /= p;
                } // while
            } // if

        } // for

        if(n > 1) {
            result = result - result / n;
        } // if
        System.out.println(result);
    } // main
} // class
