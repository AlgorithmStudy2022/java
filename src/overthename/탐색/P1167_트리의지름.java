package overthename.탐색;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P1167_트리의지름 {
	static boolean visited[];
	static  int[] distance;
	static  ArrayList<Edge>[] A;

	public static  void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		A = new ArrayList[n+1];

		for(int i=1; i<n+1; i++){
			A[i]= new ArrayList<Edge>();
		}

		for(int i=0; i<n; i++){
			int s = sc.nextInt();
			while (true){
				int e = sc.nextInt();
				if(e==-1)
					break;
				int v = sc.nextInt();
				A[s].add(new Edge(e,v));
			}
		}

		distance=new int[n+1];
		visited=new boolean[n+1];
		BFS(1);
		int max=1;
		for(int i=2; i<=n; i++){
			if(distance[max]<distance[i])
				max=i;
		}

		//max로 bfs
		distance=new int[n+1];
		visited=new boolean[n+1];
		BFS(max);

		Arrays.sort(distance);
		System.out.println(distance[n]);
	}



	static void BFS(int s) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(s);
		visited[s]=true;

		while(!queue.isEmpty()){
			int now= queue.poll();
			for(Edge i : A[now]){
				int e=i.e;
				int v=i.value;
				if(visited[e]==false){
					visited[e]=true;
					queue.add(e);
					distance[e]= distance[now]+v;
				}
			}
		}
	}
}


class Edge {
	int e;
	int value;
	public Edge(int e, int value){
		this.e =e;
		this.value=value;
	}
}