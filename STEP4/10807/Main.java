import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int c = Integer.parseInt(br.readLine());
        int d;
        int r = 0;

        st = new StringTokenizer(br.readLine());
        int[] s = new int[c];
        for (int i = 0; i < c; i++) {
            s[i] = Integer.parseInt(st.nextToken());
        }
        d = Integer.parseInt(br.readLine());
        for (int x : s) {
            if (x == d) r++;
        }
        System.out.print(r);
    }
}
