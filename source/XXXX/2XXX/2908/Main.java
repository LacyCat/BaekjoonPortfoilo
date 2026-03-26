import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int a = 0;
        int b = 0;
        st = new StringTokenizer(br.readLine());
        sb.append(st.nextToken());
        a = Integer.parseInt(sb.reverse().toString());
        sb = new StringBuilder(st.nextToken());
        b = Integer.parseInt(sb.reverse().toString());
        System.out.print(Math.max(a, b));
    }
}
