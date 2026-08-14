import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        while (true) {
            String line = br.readLine();
            if (line == null || line.isEmpty()) {
                break;
            }
            st = new StringTokenizer(line);
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            if (2 > n || n > 9 || 2 > m || m > 9 ) {
                sb.append("INPUT ERROR!\n");
                continue;
            }
            if (n < m) {
                for (int i = 1; i < 10; i++) {
                    for (int j = n; j <= m; j++) {
                        sb.append(String.format("%d * %d = ", j, i));
                        if (i * j - 10 >= 0) sb.append(i*j);
                        else sb.append(" "+i*j);
                        if (j != m) sb.append("   ");
                    }
                    sb.append("\n");
                }
            }
            else {
                for (int i = 1; i < 10; i++) {
                    for (int j = n; j >= m; j--) {
                        sb.append(String.format("%d * %d = ", j, i));
                        if (i * j - 10 >= 0) sb.append(i*j);
                        else sb.append(" "+i*j);
                        if (j != m) sb.append("   ");
                    }
                    sb.append("\n");
                }
            }
        }
        System.out.print(sb);
    }
}