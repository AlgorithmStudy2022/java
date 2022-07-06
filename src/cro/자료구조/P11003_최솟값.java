package cro.자료구조;

import java.io.*;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class P11003_최솟값 {

    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(stringTokenizer.nextToken());
        int L = Integer.parseInt(stringTokenizer.nextToken());
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        Deque<Node> myDeque = new LinkedList<Node>();

        for(int i = 0; i < N; i++) {
            int now = Integer.parseInt(stringTokenizer.nextToken());

            while (!myDeque.isEmpty() && myDeque.getLast().value > now) {
                myDeque.removeLast();
            } // while

            myDeque.addLast(new Node(now, i));

            if(myDeque.getFirst().index <= i - L) {
                myDeque.removeFirst();
            } // if

            bufferedWriter.write(myDeque.getFirst().value + " ");
        } // for

        bufferedWriter.flush();
        bufferedWriter.close();
    } // main

    static class Node {
        public int value;
        public int index;

        Node(int value, int index) {
            this.value = value;
            this.index = index;
        } // constructor
    } // Node
} // public class
