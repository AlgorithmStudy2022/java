package cro.정렬;

import java.util.Arrays;
import java.util.Scanner;

public class P11399_ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int p[] = new int[number];

        for(int i = 0; i < p.length; i++) {
            p[i] = sc.nextInt();
        } // for
        Arrays.sort(p);

        int pre = 0;
        int total = 0;

        for(int i = 0; i < number; i++) {
            total += pre + p[i];
            pre += p[i];
        } // for
        System.out.println(total);
    } // main
} // class
