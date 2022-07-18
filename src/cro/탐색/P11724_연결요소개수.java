package cro.탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class P11724_연결요소개수 {
    static ArrayList<Integer> A[];
    static boolean visited[];

    public static  void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int n = Integer.parseInt(stringTokenizer.nextToken());
        int m = Integer.parseInt(stringTokenizer.nextToken());
        A = new ArrayList[n+1];
        visited = new boolean[n+1];

        for(int i = 1; i < n + 1; i++) {
            A[i] = new ArrayList<Integer>();
        } // for

        for(int i = 0; i < m; i++){
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int s = Integer.parseInt(stringTokenizer.nextToken());
            int e = Integer.parseInt(stringTokenizer.nextToken());
            A[s].add(e);
            A[e].add(s);
        } // for

        int count = 0;

        for(int i = 1; i < n + 1; i++){
            if(!visited[i]){
                count++;
                DFS(i);
            } // if
        } // for
        System.out.println(count);
    } // main

    static void DFS(int v){

        if (visited[v]){
            return;
        } //  if

        visited[v]=true;

        for(int i : A[v]){
            if(visited[i] == false){
                DFS(i);
            } // if
        } // for
    } // DFS()
} // end class
