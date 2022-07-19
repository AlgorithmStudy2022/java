package overthename.탐색;

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
		A = new ArrayList[n+1];

		for(int i=1; i<n+1; i++){
			A[i]= new ArrayList<Integer>();
		}
		for(int i=0; i<m; i++){
			int s = sc.nextInt();
			int e = sc.nextInt();
			A[s].add(e);
			A[e].add(s);
		}

		//번호가 작은 것을 먼저 방문하기 위한 정렬
		for(int i=0; i<m; i++){
			Collections.sort(A[i]);
		}

		//dfs
		visited = new boolean[n+1];
		DFS(start);
		System.out.println();

		//bfs
		visited = new boolean[n+1];
		BFS(start);
		System.out.println();
	}

	static void DFS(int v){
		System.out.print(v+" ");

		visited[v]=true;
		for(int i : A[v]){
			if(visited[i]==false){
				DFS(i);
			}
		}
	}

	static void BFS(int v) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(v);
		visited[v]=true;

		while(!queue.isEmpty()){
			int now= queue.poll();
			System.out.print(now+" ");
			for(int i : A[v]){
				if(visited[i]==false){
					visited[i]=true;
					queue.add(i);
				}
			}
		}
	}
}
