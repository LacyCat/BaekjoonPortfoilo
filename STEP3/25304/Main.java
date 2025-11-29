import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int rt = 0;
        int p;
        int oc;
        for (int i = 0; i < c; i++) {
            st = new StringTokenizer(br.readLine());
            p = Integer.parseInt(st.nextToken());
            oc = Integer.parseInt(st.nextToken());
            rt += p * oc;
        }
        if (rt == t) System.out.print("Yes");
        else System.out.print("No");
    }
}
