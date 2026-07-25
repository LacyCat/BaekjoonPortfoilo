import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int r = 0;
        for (int i = 1; i < n; i++) {
            int m = i;
            int s = i;
            while (m > 0) {
                s += m % 10;
                m /= 10;
            }
            if (s == n) {
                r = i;
                break;
            }
        }
        System.out.print(r);
    }
}