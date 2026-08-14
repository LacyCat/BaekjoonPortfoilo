import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        while (true) {
            st = new StringTokenizer(br.readLine());
            int f = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());
            if (f == 0 && s == 0) break;
            if (s % f == 0) {
                sb.append("factor" + "\n");
            } else if (f % s == 0) {
                sb.append("multiple" + "\n");
            } else {
                sb.append("neither" + "\n");
            }
        }
        System.out.print(sb);
    }
}
