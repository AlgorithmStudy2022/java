package overthename.자료구조;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.Stack;

public class P17298_오큰수 {
	public static  void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		int[] A= new int[n]; //수열배열
		int[]ans = new int[n]; //정답배열
		String[] str = bf.readLine().split(" ");
		for (int i=0; i<n; i++){
			A[i] = Integer.parseInt(str[i]);
		}
		Stack<Integer> stack = new Stack<>();
		stack.push(0); //초기화

		for(int i=1; i<n; i++){
			while (!stack.isEmpty() && A[stack.peek()]<A[i]){
				ans[stack.pop()] = A[i];
			}
			stack.push(i);
		}

		while(!stack.isEmpty()){
			ans[stack.pop()]=-1;
		}

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for( int i=0; i<n; i++){
			bw.write(ans[i]+ " ");
		}
		bw.write("\n");
		bw.flush();

	}
}
