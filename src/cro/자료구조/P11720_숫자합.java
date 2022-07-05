package cro.자료구조;

import java.util.Scanner;

public class P11720_숫자합 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        String number = sc.next();

        int sum = 0;

        for(int i = 0; i < count; i++) {
            sum += number.charAt(i) - '0';
        } // for

        System.out.println(sum + " ");
    } // main
} // class
