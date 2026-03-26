import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = 0;
        int r = 0;
        List<Integer> d = new ArrayList<>();
        while (true) {
            r = 0;
            d = new ArrayList<>();
            n = Integer.parseInt(br.readLine());
            if (n == -1) break;
            for (int i = 1; i <= n / 2; i++) {
                if (n % i == 0) {
                    d.add(i);
                    r += i;
                }
            }
            if (r == n) {
                sb.append(n + " = ");
                for (int i = 0; i < d.size(); i++) {
                    if (i != d.size() - 1) sb.append(d.get(i) + " + ");
                    else sb.append(d.get(i)).append("\n");
                }
            }
            else {
                sb.append(n + " is NOT perfect.").append("\n");
            }
        }
        System.out.print(sb);
    }
}
