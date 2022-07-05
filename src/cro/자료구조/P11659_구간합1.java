package cro.자료구조;

import java.io.IOException;
import java.util.Scanner;

public class P11659_구간합1 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int question = sc.nextInt();

        int[] arr = new int[count + 1];

        arr[0] = 0;

        for(int i = 1; i <= count; i++) {
            arr[i] = arr[i - 1] + sc.nextInt();
        } // for

        for(int i = 0; i < question; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();

            System.out.println(arr[end] - arr[start - 1]);
        } // for
    } // main
} // class
