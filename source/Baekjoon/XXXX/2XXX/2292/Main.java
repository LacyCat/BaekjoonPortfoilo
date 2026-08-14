import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int t = 1;
        int m = 1;
        while (n > m) {
            m += 6 * t;
            t++;
        }
        System.out.print(t);
    }
}
