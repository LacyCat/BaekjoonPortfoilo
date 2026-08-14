import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        if (n < m) {
            for (int i = n; i <= m; i++) {
                for (int j = 1; j < 10; j++) {
                    sb.append(i + " * " + j + " = ");
                    if (i * j - 10 >= 0) sb.append(i*j);
                    else sb.append(" " + i*j);
                    if (j % 3 == 0) sb.append("\n");
                    else sb.append("   ");
                }
                sb.append("\n");
            }
        }
        else {
            for (int i = n; i >= m; i--) {
                for (int j = 1; j < 10; j++) {
                    sb.append(i + " * " + j + " = ");
                    if (i * j - 10 >= 0) sb.append(i*j);
                    else sb.append(" " + i*j);
                    if (j % 3 == 0) sb.append("\n");
                    else sb.append("   ");
                }
                sb.append("\n");
            }
        }
        System.out.print(sb.toString());
    }
}