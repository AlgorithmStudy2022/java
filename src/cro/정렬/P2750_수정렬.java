package cro.정렬;

import java.util.Scanner;

public class P2750_수정렬 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();

        int number[] = new int[count];

        for(int i = 0; i < count; i++) {
            number[i] = sc.nextInt();
        } // for

        for(int i = 0; i < count - 1; i++) {
            for(int j = 0; j < count - 1 - i; j++) {
                if(number[j]  > number[j + 1]) {
                    int temp = number[j];
                    number[j] = number[j + 1];
                    number[j + 1] = temp;
                } // if
            } // inner - for
        } // for

        for(int i = 0; i < count; i++) {
            System.out.println(number[i]);
        }
    } // main
} // class
