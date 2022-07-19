package cro.탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class P1206_DFS와BFS {
    static ArrayList<Integer>[] A;
    static boolean visited[];
    public static  void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int start = sc.nextInt();
        A = new ArrayList[n + 1];

        for(int i = 1; i <= n; i++){
            A[i] = new ArrayList<Integer>();
        } // for

        for(int i=0; i < m; i++){
            int s = sc.nextInt();
            int e = sc.nextInt();
            A[s].add(e);
            A[e].add(s);
        } // for

        for(int i = 1; i <= n; i++){
            Collections.sort(A[i]);
        } // for

        visited = new boolean[n + 1];
        DFS(start);
        System.out.println();

        visited = new boolean[n + 1];
        BFS(start);
        System.out.println();
    } // main

    static void DFS(int node){
        System.out.print(node + " ");

        visited[node] = true;

        for(int i : A[node]){

            if(!visited[i]){
                DFS(i);
            } // if

        } // for
    } // DFS

    static void BFS(int node) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(node);
        visited[node] = true;

        while(!queue.isEmpty()){
            int now = queue.poll();

            System.out.print(now + " ");

            for(int i : A[node]){

                if(!visited[i]){
                    visited[i] = true;
                    queue.add(i);
                } // if

            } // for

        } // while
    } // BFS
} // class