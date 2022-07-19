package cro.정수론;

import java.util.Scanner;

public class P1016_제곱이아닌수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long min = sc.nextLong();
        long max = sc.nextLong();


        boolean Check[] = new boolean[(int) (max - min + 1)];

        for(long i = 2; i * i <= max; i++) {
            long pow = i * i; // 제곱수
            long start_index = max / pow;

            if(min % pow != 0)
                start_index++;

            for(long j = start_index; pow * j <= max; j++) {
                Check[(int) ((j * pow) - min)] = true;
            } // inner - for
        } // for
        int count = 0;

        for(int i = 0; i <= max - min; i++) {
            if(!Check[i])
                count++;
        } // for
        System.out.println(count);
    } // main
} // class