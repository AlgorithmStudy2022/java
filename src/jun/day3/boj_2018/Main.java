package jun.day3.boj_2018;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        int n = input.integer();
        solution(n);
    }

    public static void solution(int n) {
        int start = 0;     // 왼쪽 포인터
        int end = 0;      // 오른쪽 포인터
        int sum = 0;      // 누적합
        int count = 0;    // answer

        while (start <= n) {
            while (end++ <= n) {
                sum += end;
                if (sum >= n) {
                    if (sum == n) count++;
                    break;
                }
            }
            while (start++ <= n) {
                sum -= start;
                if (sum <= n) {
                    if (sum == n) count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }

    static Input input = new Input();

    static class Input {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        public int integer() throws Exception {
            if (!st.hasMoreElements()) st = new StringTokenizer(br.readLine());
            return Integer.parseInt(st.nextToken());
        }
    }
}
