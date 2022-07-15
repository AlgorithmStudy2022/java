package cro.정렬;

import java.io.*;

public class P2751_수정렬2 {
    public static int A[], tmp[];
    public static long result;
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(bufferedReader.readLine());
        A = new int[N + 1];
        tmp = new int[N + 1];

        for(int i = 1; i <= N; i++) {
            A[i] = Integer.parseInt(bufferedReader.readLine());
        } // for

        merget_sort(1, N);
        for(int i = 1; i <= N; i++) {
            bufferedWriter.write(A[i] + "\n");
        } // for

        bufferedWriter.flush();
        bufferedWriter.close();
    }  // main

    private static void merget_sort(int s, int e) {
        if(e - s < 1)
            return;

        int m = s + (e - s) / 2;

        merget_sort(s, m);
        merget_sort(m + 1, e);

        for(int i = s; i <= e; i++) {
            tmp[i] = A[i];
        } // for

        int k = s;
        int index1 = s;
        int index2 = m + 1;

        while (index1 <= m && index2 <= e) {
            if(tmp[index1] > tmp[index2]) {
                A[k] = tmp[index2];
                k++;
                index2++;
            } else {
                A[k] = tmp[index1];
                k++;
                index1++;
            } // if - else
        } // while

        while (index1 <= m) {
            A[k] = tmp[index1];
            k++;
            index1++;
        } // while

        while (index2 <= e) {
            A[k] = tmp[index2];
            k++;
            index2++;
        } // while
    } // merget_sort
} // class
