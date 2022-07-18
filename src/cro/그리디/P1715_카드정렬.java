package cro.그리디;

import java.util.PriorityQueue;
import java.util.Scanner;

public class P1715_카드정렬 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        for(int i = 0; i < N; i++) {
            int data = sc.nextInt();
            priorityQueue.add(data);
        } // for

        int data1 = 0;
        int data2 = 0;
        int sum = 0;

        while(priorityQueue.size() != 1) {
            data1 = priorityQueue.remove();
            data2 = priorityQueue.remove();
            sum += data1 + data2;

            priorityQueue.add(data1 + data2);
        } // while
        System.out.println(sum);
    } // main
} // class
