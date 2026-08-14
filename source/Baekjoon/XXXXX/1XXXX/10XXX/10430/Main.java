import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (st.hasMoreTokens()) {
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());
            sb.append((A + B)%C).append("\n");
            sb.append(((A%C)+(B%C))%C).append("\n");
            sb.append((A*B)%C).append("\n");
            sb.append(((A%C)*(B%C))%C);
        }
        bw.write(sb);
        bw.flush();
    }
}
