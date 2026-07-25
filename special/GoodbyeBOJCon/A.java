import java.io.*;
import java.util.*;

// 안녕... 백준
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String w_s = " ";
        String s = "*";
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n * 2; i++) {
            sb.append(w_s.repeat(2 * n - (i+1))).append(s);
            if (i < n) {
                sb.append(w_s.repeat(n)).append(s + w_s.repeat(2 * i + 1) + s).append(w_s.repeat(n - i));
            } else {
                sb.append(w_s.repeat(2 * i - n + 1)).append(s + w_s.repeat(2 * (2 * n - i) - 1) + s).append(w_s.repeat(n - (2 * n - i) + 1));
            }
            sb.append("\n");
        }
        bw.append(sb);
        bw.flush();
        bw.close();
    }
}