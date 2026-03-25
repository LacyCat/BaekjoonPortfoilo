import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = 0;
        int m = 0;
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = i + 1;
        }
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            a = flip(a, Integer.parseInt(st.nextToken()) - 1, Integer.parseInt(st.nextToken()) - 1);
        }
        for (int i = 0; i < n; i++) {
            sb.append(a[i] + " ");
        }
        sb.deleteCharAt(sb.length() - 1);
        bw.write(sb.toString());
        bw.flush();
    }
    static int[] flip(int[] a, int i_f, int i_s) {
        int[] t = Arrays.copyOfRange(a, i_f, i_s + 1); // i_s 포함
        int[] r = new int[t.length];
        for (int i = 0; i < t.length; i++) {
            r[i] = t[t.length - 1 - i]; // t 뒤집기
        }
        System.arraycopy(r, 0, a, i_f, r.length); // a에 덮어쓰기
        return a; // a 반환
    }

}
