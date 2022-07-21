package cro.정수론;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class P1033_칵테일 {

    static ArrayList<cNode> A[];
    static long lcm;
    static boolean visited[];
    static long D[];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = sc.nextInt();
        A = new ArrayList[N];
        visited = new boolean[N];
        D = new long[N];
        lcm = 1;

        for(int i = 0; i < N - 1; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int p = sc.nextInt();
            int q = sc.nextInt();

            A[a].add(new cNode(b, p, q));
            A[b].add(new cNode(a, p, q));
        } // for

        D[0] = lcm;
        DFS(0);
        long mgcd = D[0];

        for(int i = 1; i < N; i++) {
            mgcd = gcd(mgcd, D[i]);
        } // for

        for(int i = 0; i < N; i++) {
            System.out.println(D[i] / mgcd + " ");
        } // for
    } // main

    public static long gcd(long a, long b) {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    } // gcd()

    public static void DFS(int Node) {
        visited[Node] = true;

        for(cNode i : A[Node]) {
            int next = i.getB();

            if(!visited[next]) {
                D[next] = D[Node] * i.getQ() / i.getP();
                DFS(next);
            } // if
        } // for
    } // DFS
} // 칵테일 end class

class cNode {
    int b;
    int p;
    int q;

    public cNode(int b, int p, int q) {
        super();
        this.b = b;
        this.p = p;
        this.q = q;
    } // cNode constructor

    public int getB() {
        return b;
    } // getB()

    public int getP() {
        return p;
    } // getP()

    public int getQ() {
        return q;
    } // getQ()
} // cNode end class
