import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int r = 0;
        while (n >= 0) {
            if (n % 5 == 0) {
                r += n / 5;
                System.out.println(r);
                return;
            }
            n -= 3;
            r++;
        }
        System.out.print(-1);
    }
}