package overthename.자료구조;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class P2164_카드 {
	public static  void main(String[] args) throws IOException {
		//큐 사용
		Scanner sc = new Scanner(System.in);
		Queue<Integer> queue = new LinkedList<>();
		int N = sc.nextInt();

		//큐에 저장
		for (int i=1; i<=N; i++){
			queue.add(i);
		}

		//카드가 한장 남을 떄까지 맨위의 카드를 버리고, 맨 위의 카드를 가장 아래 카드 밑으로 이동
		while(queue.size() >1){
			queue.poll();
			queue.add(queue.poll());
		}
		System.out.println(queue.poll());

	}
}
