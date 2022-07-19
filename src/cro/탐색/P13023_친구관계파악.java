package cro.탐색;

import java.util.ArrayList;
import java.util.Scanner;

public class P13023_친구관계파악 {
    static boolean visited[];
    static ArrayList<Integer> A[];
    static boolean arrive;
    public static void main(String[] args) {
        int N;
        int M;
        arrive = false;

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        A = new ArrayList[N];
        visited = new boolean[N];

        for(int i = 0; i < N; i++) {
            A[i] = new ArrayList<Integer>();
        } // for

        for(int i = 0; i < M; i++) {
            int S = sc.nextInt();
            int E = sc.nextInt();
            A[S].add(E);
            A[E].add(S);
        } // for

        for(int i = 0; i < N; i++) {
            DFS(i, 1);

            if(arrive)
                break;
        } // for

        if(arrive) {
            System.out.println("1");
        } else {
            System.out.println("0");
        } // if - else



    }

    private static void DFS(int now, int depth) {
        if(depth == 5 || arrive) {
            arrive = true;
            return;
        } // if

        visited[now] = true;

        for(int i : A[now]) {
            if(!visited[i]) {
                DFS(i, depth + 1);
            } // if
        } // for
        visited[now] = false;
    } // DFS()
}
