package cro.자료구조;

import java.util.Scanner;

public class P1546_평균 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int record[] = new int[sc.nextInt()];

        for(int i = 0; i < record.length; i++) {
            record[i] = sc.nextInt();
        } // for

        int sum = 0;
        int max = 0;

        for(int i = 0; i < record.length; i++){
            max = (record[i] > max)? max = record[i] : max;

            sum += record[i];
        } // for

        System.out.println(sum * 100 / max / record.length);

    } // main
} // class
