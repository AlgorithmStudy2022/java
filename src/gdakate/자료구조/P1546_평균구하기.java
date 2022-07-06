package gdakate.자료구조;

import java.util.Scanner;

public class P1546_평균구하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N= sc.nextInt();
        int subject[]=new int[N];

        int max=subject[0];
        for(int i=0;i<N;i++){
            if(subject[i]>max){
                max=subject[i];
            }
        }
        int sum=0;
        for(int i=0;i<N;i++){
            sum+= subject[i]/max*100;
        }

        System.out.println(sum);

    }
}