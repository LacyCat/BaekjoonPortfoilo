import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int m = 0;
        int r = 0;
        st = new StringTokenizer(br.readLine());
        List<Integer> d;
        for (int i = 0; i < n; i++) {
            d = new ArrayList<>();
            m = Integer.parseInt(st.nextToken());
            for (int j = 1; j < m; j++) {
                if (m % j == 0) d.add(j);
            }
            if (d.size() == 1 && d.contains(1)) r++;
        }
        System.out.print(r + "");
    }
}
