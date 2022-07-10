package cro.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

public class P1377_버블소트프로그램 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(bufferedReader.readLine());

        mData A[] = new mData[number];

        for(int i = 0; i < number; i++) {
            A[i] = new mData(Integer.parseInt(bufferedReader.readLine()), i);
        } // for
        Arrays.sort(A);

        int max = 0;

        for(int i = 0; i < number; i++) {
            if(max < A[i].index - i)
                max = A[i].index - i;
        } // for
        System.out.println(max + 1);

    } // main
} // class

class mData implements Comparable<mData> {
    int value;
    int index;

    public mData(int value, int index) {
        super();
        this.value = value;
        this.index = index;
    } // constructor

    @Override
    public int compareTo(mData o) {
        return this.value - o.value;
    } // compareTo
} // mData
