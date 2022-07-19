package cro.정수론;

import java.util.Scanner;

public class P1934_최소공배수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();

        for(int i = 0; i < test; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int result = a * b / gcd(a, b);
            System.out.println(result);
        } // for
    } // main

    private static int gcd(int a, int b) {
        if(b == 0)
            return a;
        else
            return gcd(b, a % b);
    } // gcd()
} // class

