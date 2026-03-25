import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int mx_x = Integer.MIN_VALUE;
        int mn_x = Integer.MAX_VALUE;
        int mx_y = Integer.MIN_VALUE;
        int mn_y = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            mx_x = Math.max(mx_x,x);
            mn_x = Math.min(mn_x,x);
            mx_y = Math.max(mx_y,y);
            mn_y = Math.min(mn_y,y);
        }
        System.out.print((mx_x - mn_x) * (mx_y - mn_y));
    }
}
