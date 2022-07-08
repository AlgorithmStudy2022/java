package cro.자료구조;

import java.util.Arrays;
import java.util.Scanner;

public class P1253_좋은수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int count = 0;

        long A[] = new long[number];

        for(int i = 0; i < number; i++) {
            A[i] = sc.nextInt();
        }

        Arrays.sort(A);

        for(int k = 0; k < number; k++) {
            long find = A[k];
            int i = 0;
            int j = number - 1;

            while(i < j) {

                if(A[i] + A[j] == find) {

                    if(i != k && j != k) {
                        count++;
                        break;
                    } else if(i == k) {
                        i++;
                    } else if (j == k) {
                        j--;
                    } // inner if - else

                } else if (A[i] + A[j] < find) {
                    i++;
                } else {
                    j--;
                } // if - else

            } // while
        } // for

        System.out.println(count);
    } // main
} //  class
