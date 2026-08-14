import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        String r =
                switch (m) {
                    case 2 -> Integer.toBinaryString(n);
                    case 8 -> Integer.toOctalString(n);
                    case 16 -> Integer.toHexString(n);
                    default -> "";
                };
        System.out.print(r.toUpperCase());
    }
}