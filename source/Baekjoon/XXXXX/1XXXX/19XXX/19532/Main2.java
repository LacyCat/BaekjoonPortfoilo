import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] a = new int[6];
        for (int i = 0; i < 6; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        var r = calc(a[0], a[1], a[2], a[3], a[4], a[5]);
        System.out.print(r[0] + " " + r[1]);
    }
    // 크라메르 공식 사용
    static int[] calc(int a, int b, int c, int d, int e, int f) {
        int D = a*e - b*d;
        return new int[]{(c*e - b*f) / D, (a*f - c*d) / D};
    }
}