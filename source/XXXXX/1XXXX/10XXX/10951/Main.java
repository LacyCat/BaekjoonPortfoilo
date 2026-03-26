import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int a;
        int b;
        while (true) {
            String l = br.readLine();
            if (l == null) break;
            else {
                st = new StringTokenizer(l);
                a = Integer.parseInt(st.nextToken());
                b = Integer.parseInt(st.nextToken());
                sb. append(a + b).append("\n");
            }
        }
        bw.write(sb.toString());
        bw.flush();
    }
}
