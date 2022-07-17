package overthename.탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.concurrent.ThreadPoolExecutor;

public class P2023_신기한소수 {
	static int N;

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();

		//일의 자리 소수는 2,3,4,5
		DFS(2, 1);
		DFS(3, 1);
		DFS(5, 1);
		DFS(7, 1);
	}

	static void DFS(int num, int jarisu) {
		if (jarisu == N) {
			if (isPrime(num)) {
				System.out.println(num);
			}
		}
		for (int i = 1; i < 10; i++) {
			if (i % 2 == 0) {
				continue;
			}
			if (isPrime(num * 10 + i)) {
				DFS(num * 10 + i, jarisu + 1);
			}
		}
	}

	static boolean isPrime(int num) {
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				return false; }
			}
		return true;
	}


}

