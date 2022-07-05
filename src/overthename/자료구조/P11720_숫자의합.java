package overthename.자료구조;

import java.util.Scanner;

public class P11720_숫자의합 {
 public static  void main(String[] args){
 	Scanner sc = new Scanner(System.in);
 	int N = sc.nextInt();
 	String sNum = sc.next();
 	char[] cNum = sNum.toCharArray();
 	int sum=0;
 	for (int i=0; i< cNum.length; i++){
 		//'0'은 아스키코드 48
 		sum += cNum[i] -'0';
	}
 	System.out.println(sum);
 }
}
