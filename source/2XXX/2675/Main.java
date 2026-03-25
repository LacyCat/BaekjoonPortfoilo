import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        
        int c = Integer.parseInt(br.readLine());
        int k;
        String s;
        for (int i = 0; i < c; i++) {
            st = new StringTokenizer(br.readLine());
            k = Integer.parseInt(st.nextToken());
            s = st.nextToken();
            for (int j = 0; j < s.length(); j++) {
                sb.append(String.valueOf(s.charAt(j)).repeat(k));
            }
            if (c - 1 > i) sb.append("\n");
        }
        System.out.print(sb);
    }
}
