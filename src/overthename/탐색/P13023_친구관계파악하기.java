package overthename.탐색;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class P13023_친구관계파악하기 {
	static boolean visited[];
	static ArrayList<Integer>[] A;
	static boolean arrive;

	public static  void main(String[] args) throws IOException {
		int N;
		int M;
		arrive = false;
		Scanner scan = new Scanner(System.in);
		N=scan.nextInt(); //노드개수
		M=scan.nextInt(); //에지개수
		A= new ArrayList[N];
		visited = new boolean[N];
		for(int i=0; i<N;i++){
			A[i] = new ArrayList<Integer>();
		}
		for(int i=0; i<M; i++){
			int S=scan.nextInt();
			int E = scan.nextInt();
			A[S].add(E);
			A[E].add(S);
		}
		for(int i=0; i<N; i++){
			DFS(i,1);
			if(arrive)
				break;
		}
		if(arrive)
			System.out.println("1");
		else
			System.out.println("0");

	}
	static void DFS(int v,int depth){
		if(depth==5 || arrive){
			arrive = true;
		}
		visited[v]=true;
		for(int i : A[v]){
			if(visited[i]==false){
				DFS(v,depth+1);
			}
		}
		visited[v]=false;

	}
}
