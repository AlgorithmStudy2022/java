package overthename.정수론;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class P1747_소수팰린드롬 {

	public static  void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		for (int i = n; i < 999999999; i++) {
			if (isPrime(i) && isPalindrom(i)) {
				System.out.println(i);
				break;
			}
		}
	}
		static boolean isPrime(int num){
			if(num==1)
				return false;

			for(int i=2; i<=Math.sqrt(num);i++){
				if(num%i==0)
					return false;
			}
			return true;
		}

	static boolean isPalindrom(int num){
		StringBuilder sb = new StringBuilder(num+"");
		if(!sb.toString().equals(sb.reverse().toString()))
			return false;
		return true;
	}
}
