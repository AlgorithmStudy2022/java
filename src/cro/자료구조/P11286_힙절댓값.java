package cro.자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class P11286_힙절댓값 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine());

        PriorityQueue<Integer> priQueue = new PriorityQueue<>((o1, o2) -> {
           int first_abs = Math.abs(o1);
           int second_abs = Math.abs(o2);

           if(first_abs == second_abs)
               return o1 > o2 ? 1 : -1;
           else
               return first_abs - second_abs;
        }); // priorityQueue

        for(int i = 0; i < N; i++) {
            int request = Integer.parseInt(bufferedReader.readLine());

            if(request == 0) {
                if(priQueue.isEmpty())
                    System.out.println("0");
                else
                    System.out.println(priQueue.poll());
            } else {
                priQueue.add(request);
            } // if - else
        } // for
    } // main
} // class
