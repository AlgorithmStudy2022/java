package jun.greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

/**
 * 반례
 * 5 (-537, 81, -435, 257, 157)
 * 답: 274025
 */
public class P1744_수를_묶어서_최댓값_만들기 {
    public static void main(String[] args) throws Exception {
        int n = input.integer();
        List<Integer> plus = new ArrayList<>();
        List<Integer> others = new ArrayList<>();
        List<Integer> minus = new ArrayList<>();

        for (int index = 0; index < n; index++) {
            int number = input.integer();
            if (number > 1) {
                plus.add(number);
                ;
            } else if (number == 1) {
                others.add(number);
            } else {
                minus.add(number);
            }
        }
        Collections.sort(plus, Collections.reverseOrder());
        Collections.sort(others);
        Collections.sort(minus);

        int sum = 0;

        if (plus.size() != 0) {
            if (plus.size() % 2 != 0) {
                for (int index = 0; index < plus.size() - 1; index += 2) {
                    sum += plus.get(index) * plus.get(index + 1);
                }
                sum += plus.get(plus.size() - 1);
            } else {
                for (int index = 0; index < plus.size(); index += 2) {
                    sum += plus.get(index) * plus.get(index + 1);
                }
            }
        }
        if (others.size() != 0) {
            for (int index = 0; index < others.size(); index++) {
                sum += others.get(index);
            }
        }
        if (minus.size() != 0) {
            if (minus.size() % 2 != 0) {
                for (int index = 0; index < minus.size() - 1; index += 2) {
                    sum += minus.get(index) * minus.get(index + 1);
                }
                sum += minus.get(minus.size() - 1);
            } else {
                for (int index = 0; index < minus.size(); index += 2) {
                    sum += minus.get(index) * minus.get(index + 1);
                }
            }
        }
        System.out.println(sum);
    }

    static Input input = new Input();

    static class Input {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        public int integer() throws Exception {
            if (!st.hasMoreElements()) st = new StringTokenizer(br.readLine());
            return Integer.parseInt(st.nextToken());
        }

        public String next() throws Exception {
            if (!st.hasMoreElements()) st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }

        public char[] nToCharArray() throws Exception {
            if (!st.hasMoreElements()) st = new StringTokenizer(br.readLine());
            return st.nextToken().toCharArray();
        }
    }
}
