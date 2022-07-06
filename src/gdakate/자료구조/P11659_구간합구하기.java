package gdakate.자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class P11659_구간합구하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        int M= Integer.parseInt(st.nextToken());
        int N= Integer.parseInt(st.nextToken());
        int[] s=new int[M+1];
        StringTokenizer sr= new StringTokenizer(br.readLine());
        for (int i=1;i<=M;i++){

            s[i]=s[i-1]+Integer.parseInt(sr.nextToken());
        }

        //왜 에러 & string tokenizer 더 공부
        StringTokenizer ss= new StringTokenizer(br.readLine());
        for (int a=0;a<N;a++){
            int I= Integer.parseInt(ss.nextToken());
            int J= Integer.parseInt(ss.nextToken());
            System.out.println(s[J]-s[I-1]);
        }

    }
}
