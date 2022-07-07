package cro.자료구조;

import java.io.*;
import java.util.Stack;

public class P17298_오큰수 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        int A[] = new int[n];
        int ans[] = new int[n];
        String[] str = bufferedReader.readLine().split(" ");

        for(int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(str[i]);
        } // for

        Stack<Integer> myStack = new Stack<>();

        myStack.push(0);

        for(int i = 0; i < n; i++) {
            while(!myStack.isEmpty() && A[myStack.peek()] < A[i]) {
                ans[myStack.pop()] = A[i];
            } // while
            myStack.push(i);
        } // for

        while(!myStack.empty()) {
            ans[myStack.pop()] = -1;
        } // while

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 0; i < n; i++) {
            bufferedWriter.write(ans[i] + " ");
        } // for

        bufferedWriter.write("\n");
        bufferedWriter.flush();
    } // main
} // class
