package overthename.자료구조;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class P12891_DNA비밀번호 {
	static  int checkArr[];
	static int myArr[];
	static int checkSecret;

	public static  void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int S = Integer.parseInt(st.nextToken());
		int P = Integer.parseInt(st.nextToken());
		int Result =0;
		char A[] = new char[S];
		checkArr = new int[4];
		myArr = new int[4];
		checkSecret=0;

		A=bf.readLine().toCharArray();
		st = new StringTokenizer(bf.readLine());
		for(int i=0; i<4; i++){
			checkArr[i] = Integer.parseInt(st.nextToken());

		}



	}
