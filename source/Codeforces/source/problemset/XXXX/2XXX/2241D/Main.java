import java.io.*;
import java.util.*;

public class Main {
    /*
     * 2241D
     */
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;


        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            long[] a = new long[n];
            long[] b = new long[n];

            // INIT
            for (int j = 0; j < 2; j++) {
                st = new StringTokenizer(br.readLine());
                for (int k = 0; k < n; k++) {
                    if (j == 0) a[k] = Integer.parseInt(st.nextToken());
                    else b[k] = Integer.parseInt(st.nextToken());
                }
            }

            for (int j = n - 1; j > 0; j--) {
                if (a[j] > b[j]) {
                    long o = a[j] - b[j];
                    a[j - 1] +=  o;
                }
            }
            if (a[0] > b[0]) {
                sb.append("NO\n");
            } else {
                sb.append("YES\n");
            }
        }
        bw.append(sb);
        bw.flush();
        bw.close();
    }
}