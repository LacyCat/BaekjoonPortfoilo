import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        while (true) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            if (n == 0 && m == 0) {
                break;
            }
            if (n > 1000 || m > 4000) {
                sb.append("INPUT ERROR!\n");
                continue;
            }
            if (m % 2 != 0 || m < 2 * n || m > 4 * n) {
                sb.append("0\n");
                continue;
            }
            sb.append( (m / 2 - n) + " " + (2 * n - m / 2) + "\n");
        }
        System.out.print(sb);
    }
}