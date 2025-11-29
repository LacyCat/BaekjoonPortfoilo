import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (st.hasMoreTokens()) {
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            for (int i = 0; i < 5; i++) {
                if (i == 0) {
                    sb.append(a+b);
                }
                else if (i == 1) {
                    sb.append(a-b);
                }
                else if (i == 2) {
                    sb.append(a*b);
                }
                else if (i == 3) {
                    sb.append(a/b);
                }
                else {
                    sb.append(a%b);
                    break;
                }
                sb.append("\n");
            }
        }
        bw.write(sb);
        bw.flush();
    }
}
