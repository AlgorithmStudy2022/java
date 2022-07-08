package gdakate.자료구조;

import java.util.Scanner;

public class P11720_숫자의합구하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N= sc.nextInt();

        String c=sc.next();
        char [] num=c.toCharArray(); //문자열을 char형 배열로 바꿔줌
        int sum=0;
        for(int i=0;i<N;i++){
            sum+=num[i]-'0';//-'0' : why?
        }
        System.out.println(sum);
    }
}