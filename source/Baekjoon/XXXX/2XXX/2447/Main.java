import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sb.append(check(i,j) ? "*" : " ");
            }
            sb.append("\n");
        }
        bw.append(sb);
        bw.flush();
        bw.close();
    }
    static boolean check(int x, int y) {
        // True = 별
        // False = 공백
        while (x > 0 || y > 0) {
            if (x % 3 == 1 && y % 3 == 1) return false;
            x /= 3;
            y /= 3;
        }
        return true;
    }
}