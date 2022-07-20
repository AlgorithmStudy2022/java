package overthename.정수론;

import java.io.IOException;
import java.util.Scanner;

public class P1934_최소공배수 {
	static boolean prime[];
	public static  void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();


		for(int i=0; i<=n; i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int result= a*b/ gcd(a,b);
			System.out.println(result);
		}


	}

	static int gcd(int a,int b) {
		if(b==0)
			return a;
		else
			return gcd(b,a%b);
	}
}
