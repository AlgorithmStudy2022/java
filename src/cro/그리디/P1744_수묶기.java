package cro.그리디;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class P1744_수묶기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        PriorityQueue<Integer> plusPq = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minusPq = new PriorityQueue<>();

        int one = 0;
        int zero = 0;

        for(int i = 0; i < N; i++) {
            int data = sc.nextInt();

            if(data > 1) {
                plusPq.add(data);
            } else if (data == 1) {
                one++;
            } else if (data == 0) {
                zero++;
            } else {
                minusPq.add(data);
            } // if - else
        } // for

        int sum = 0;

        while(plusPq.size() > 1) {
            int first = plusPq.remove();
            int second = plusPq.remove();
            sum += first * second;
        } // while

        if(!plusPq.isEmpty()) {
            sum += plusPq.remove();
        } // if

        while(minusPq.size() > 1) {
            int first = minusPq.remove();
            int second = minusPq.remove();
            sum += first * second;
        } // while

        if(!minusPq.isEmpty()) {
            if(zero == 0) {
                sum += minusPq.remove();
            } // inner if
        } // if

        sum += one;
        System.out.println(sum);
    } // main
} // class
