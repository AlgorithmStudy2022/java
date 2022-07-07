package cro.자료구조;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P2164_카드게임 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> myQueue = new LinkedList<>();

        int N = sc.nextInt();

        for(int i = 0; i < N; i++) {
            myQueue.add(i);
        } // for

        while(myQueue.size() > 1) {
            myQueue.poll();
            myQueue.add(myQueue.poll());
        } // while

        System.out.println(myQueue.poll());
    } // main
} // class
