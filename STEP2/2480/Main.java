import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int f = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());
        int p = 0;
        if (f == s && s == t) {
            p = 10000 + f * 1000;
        }
        else if (f == s) {
            p = 1000 + f * 100;
        }
        else if (s == t) {
            p = 1000 + s * 100;
        }
        else if (f == t) {
            p = 1000 + f * 100;
        }
        else {
            p = (int) Math.max(Math.max(f,s),t) * 100;
        }
        System.out.print(p);
    }
}
