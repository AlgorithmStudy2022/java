package cro.탐색;

import java.util.Scanner;

public class P2023_신기한소수 {
    static int N;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();

        DFS(2, 1);
        DFS(3, 1);
        DFS(5, 1);
        DFS(7, 1);

    } // main

    static void DFS(int number, int jarisu) {
        if(jarisu == N) {
            if(isPrime(number)) {
                System.out.println(number);
            } // inner - if
        return;
        } // if
        for(int i = 1; i < 10; i++) {
            if(i % 2 == 0) {
                continue;
            } // if
            if(isPrime(number * 10 + i)) {
                DFS(number * 10 + i, jarisu + 1);
            } // if
        } // for
    } // DFS

  static boolean isPrime(int num) {
        for(int i = 2; i <= num / 2; i++)
            if(num % i == 0)
                return false;
            return true;
  }  // isPrime

} // end class
