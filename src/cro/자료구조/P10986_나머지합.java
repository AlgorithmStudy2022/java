package cro.자료구조;

import java.util.Scanner;

public class P10986_나머지합 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        int number = sc.nextInt();

        long[] arrSum = new long[count];
        long[] declare = new long[number];

        long answer = 0;

        arrSum[0] = sc.nextInt();

        for(int i = 1; i < count; i++) {
            arrSum[i] = arrSum[i - 1] + sc.nextInt();
        } // for

        for(int i = 0; i < count; i++) {
            int remainder = (int)(arrSum[i] % number);

            if(remainder == 0) {
                answer++;
            } // if
            declare[remainder]++;
        } // for

        for(int i = 0; i < number; i++) {
            if(declare[i] > 1) {
                answer = answer + (declare[i] * (declare[i] - 1) / 2);
            } // if
        } // for

        System.out.println(answer);

    } // main
} // class
