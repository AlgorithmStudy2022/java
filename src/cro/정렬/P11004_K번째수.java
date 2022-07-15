package cro.정렬;

import java.awt.desktop.SystemEventListener;
import java.io.*;
import java.math.*;
import java.util.*;

public class P11004_K번째수 {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        ArrayList<Integer> list = new ArrayList<>();
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int number = Integer.parseInt(stringTokenizer.nextToken());
        int k = Integer.parseInt(stringTokenizer.nextToken());

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        for(int i = 0; i < number; i++) {
            list.add(Integer.parseInt(stringTokenizer.nextToken()));
        } // for

        Collections.sort(list);
        bufferedWriter.write(String.valueOf(list.get(k-1)));


        bufferedWriter.flush();
        bufferedReader.close();
        bufferedWriter.close();
    }
}
