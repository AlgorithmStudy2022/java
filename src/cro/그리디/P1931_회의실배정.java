package cro.그리디;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class P1931_회의실배정 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[][] = new int[N][2];

        for(int i = 0; i < N; i++) {
            A[i][0] = sc.nextInt();
            A[i][1] = sc.nextInt();
        } // for

        Arrays.sort(A, new Comparator<int[]>() {
            @Override
            public int compare(int S[], int E[]) {
                if(S[1] == E[1]) {
                    return S[0] - E[0];
                } // if
                return S[1] - E[1];
            } // compare
        }); // sort

        int count = 0;
        int end = -1;

        for(int i = 0; i < N; i++) {
            if(A[i][0] >= end) {
                end = A[i][1];
                count++;
            } // if
        } // for
        System.out.println(count);
    } // main
} // class
