import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int r = Integer.MAX_VALUE;
        int n, m, c_w, c_b;
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        char[][] b = new char[n][m];
        for (int i = 0; i < n; i++) {
            String l = br.readLine();
            for (int j = 0; j < m; j++) {
                b[i][j] = l.charAt(j);
            }
        }
        for (int i = 0; i <= n - 8; i++) {
            for (int j = 0; j <= m - 8; j++) {
                c_b = 0;
                c_w = 0;
                for (int x = i; x < i + 8; x++) {
                    for (int y = j; y < j + 8; y++) {
                        if ((x + y) % 2 == 0) {
                            if (b[x][y] != 'W') c_w++;
                            if (b[x][y] != 'B') c_b++;
                        } else {
                            if (b[x][y] != 'B') c_w++;
                            if (b[x][y] != 'W') c_b++;
                        }
                    }
                }
                r = Math.min(r, Math.min(c_w, c_b));
            }
        }
        System.out.print(r);
    }
}