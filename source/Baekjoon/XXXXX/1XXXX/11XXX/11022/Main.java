import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int c = Integer.parseInt(br.readLine());

        for (int i = 0; i < c; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            sb.append("Case #" + (i + 1) + ": " + a + " + " + b + " = " + (a+b)).append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
    }
}
