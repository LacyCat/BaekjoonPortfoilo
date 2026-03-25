import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        char l = 'A' - 10;
        char i_l = '1' - 1;
        String s = st.nextToken();
        int n = Integer.parseInt(st.nextToken());
        long v = 0;
        for (int i = 0; i < s.length(); i++) {
            if ('A' <= s.charAt(i) && s.charAt(i) <= 'Z') {
                v = v * n + (s.charAt(i) - l);
            }
            else {
                v = v * n + (s.charAt(i) - i_l);
            }
        }
        System.out.print(v);
    }
}
