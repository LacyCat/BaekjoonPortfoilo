import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int tmp = 0;
        int tmp2 = 0;

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i < n; i++) {
            if (i == 1) {
                int k = Integer.parseInt(st.nextToken());
                int l = Integer.parseInt(st.nextToken());
                tmp = gcd(k, l);
                tmp2 = k / tmp * l;
            } else {
                int r = Integer.parseInt(st.nextToken());
                int g = gcd(tmp2, r);
                tmp = gcd(tmp, r);
                tmp2 = tmp2 / g * r;

            }
        }
        System.out.print(tmp + " " + tmp2);
    }
    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}