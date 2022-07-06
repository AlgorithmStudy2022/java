package overthename.자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class P1940_주몽 {
	public static  void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine()); //재료개수
		int M = Integer.parseInt(bf.readLine()); //번호 합
		int[] A = new int[N];
		StringTokenizer st = new StringTokenizer(bf.readLine());
		for(int i=0; i<N; i++){
			A[i]= Integer.parseInt(st.nextToken());
		}
		Arrays.sort(A);
		int count=0;
		int i=0;
		int j= N-1;

		//투 포인터 원칙
		while (i<j){
			if(A[i]+A[j]==M){
				count++;
				i++;
				j--;
			}
			else if(A[i]+A[j] <M){
				i++;
			}else {
				j++;
			}
		}
		System.out.println(count);
		bf.close();
	}
}
