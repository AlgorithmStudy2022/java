package cro.자료구조;

import java.util.Scanner;

public class P_2018연속된자연수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int findNum = sc.nextInt();
        int count = 1;
        int start_index = 1;
        int end_index = 1;
        int sum = 1;

        while(end_index != findNum) {
            if(sum == findNum) {
                count++;

                end_index++;
                sum = sum + end_index;
            } else if (sum > findNum) {
                sum -= start_index;
                start_index++;
            } else {
                end_index++;
                sum += end_index;
            } // if - else
        } // while
        System.out.println(count);
    } // main
} // class
