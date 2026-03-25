import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int r = 0;
        List<Integer> d = new ArrayList();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) d.add(i);
        }
        try {
            r = d.get(k - 1);
        }
        catch (Exception e) {
            r = 0;
        }
        System.out.print(r);
    }
}