import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a0,a1,c,n0;
        a1 = Integer.parseInt(st.nextToken());
        a0 = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(br.readLine());
        n0 = Integer.parseInt(br.readLine());
        System.out.print(check(n0,c,a0,a1) ? 1 : 0);
    }
    static boolean check(int n0, int c, int a0, int a1) {
        return a1 <= c && a1 * n0 + a0 <= c * n0;
    }
}