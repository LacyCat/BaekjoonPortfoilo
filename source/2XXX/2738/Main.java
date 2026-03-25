import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] a = new int[n][m];
        int[][] b = new int[n][m];
        for (int i = 0; i < 2 * n; i++) {
            st = new StringTokenizer(br.readLine());
            if (i < n) {
                for (int j = 0; j < m; j++) {
                    a[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            else {
                for (int j = 0; j < m; j++) {
                    b[i - n][j] = Integer.parseInt(st.nextToken());
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sb.append(a[i][j] + b[i][j] + " ");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
