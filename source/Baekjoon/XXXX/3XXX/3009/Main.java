import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int[][] p = new int[2][3];
        int x;
        int y;
        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 2; j++) {
                p[j][i] = Integer.parseInt(st.nextToken());
            }
        }
        x = p[0][0] ^ p[0][1] ^ p[0][2];
        y = p[1][0] ^ p[1][1] ^ p[1][2];
        System.out.print(x + " " + y);
    }
}
