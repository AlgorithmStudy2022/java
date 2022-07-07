package cro.자료구조;

import java.util.Scanner;
import java.util.Stack;

public class P1874_스택오름차순 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];
        for(int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        } // for

        Stack<Integer> stack = new Stack<>();

        StringBuffer stringBuffer = new StringBuffer();
        int num = 1;
        boolean result = true;

        for(int i = 0; i < A.length; i++) {
            int su = A[i];
            if(su >= num) {
                while(su >= num) {
                    stack.push(num++);
                    stringBuffer.append("+\n");
                } // while
                stack.pop();
                stringBuffer.append("-\n");
            } else {
                int n = stack.pop();

                if(n > su) {
                    System.out.println("NO");
                    result = false;
                    break;
                } else {
                    stringBuffer.append("-\n");
                } // if - else inner if
            } // else
        } // for

        if(result)
            System.out.println(stringBuffer.toString());
    } // main
} // class
