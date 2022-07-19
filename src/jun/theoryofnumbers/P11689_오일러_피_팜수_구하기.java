package jun.theoryofnumbers;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// PASS
public class P11689_오일러_피_팜수_구하기 {
    public static void main(String[] args) throws Exception {

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
    }
}
