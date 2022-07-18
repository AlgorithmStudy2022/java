package cro.그리디;

import java.util.Scanner;

public class P1541_최솟값괄호배치 {
    static int answer = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String example = sc.nextLine();
        String str[] = example.split("-");

        for(int i = 0; i < str.length; i++) {
            int temp = mySum(str[i]);

            if(i == 0) {
                answer += temp;
            } else {
                answer -= temp;
            } // if - else
        } // for
        System.out.println(answer);
    } // main
    static int mySum(String a) {
        int sum = 0;
        String temp[] = a.split("[+]");

        for(int i = 0; i < temp.length; i++) {
            sum += Integer.parseInt(temp[i]);
        } // for
        return sum;
    } // mySum()
} // class
