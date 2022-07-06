package overthename.자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P1253_좋은수 {
	public static  void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine()); //재료개수
		int Result = 0;
		long A[] = new long[N];
		StringTokenizer st = new StringTokenizer(bf.readLine());
		for(int i=0; i<N; i++){
			A[i] = Long.parseLong(st.nextToken());
		}
		Arrays.sort(A);
		for(int k=0; k<N; k++){
			long find = A[k];
			int i=0;
			int j = N-1;
			while(i<j){
				if(A[i]+A[j]==find){
					//자기 자신을 좋은 수 만들기에 포함하면 안됨
					if(i!=k && j!=k){
						Result++;
						break;
					}else if(j==k){
						j--;
					}else{
						i++;
					}

				}else if (A[i]+A[j]<find){
					i++;
				}else{
					j--;
				}
			}
		}
		System.out.println(Result);
	}
}
