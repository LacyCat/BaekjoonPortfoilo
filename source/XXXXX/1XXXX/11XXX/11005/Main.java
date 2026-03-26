import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        char l = 'A' - 10;
        int v = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        while (v > 0) {
            int r = v % n;
            v = v / n;
            if (r >= 10) {
                sb.append((char)(r + l));
            }
            else {
                sb.append(r);
            }
        }
        System.out.print(sb.reverse());
    }
}
