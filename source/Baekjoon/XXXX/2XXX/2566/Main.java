import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int max = Integer.MIN_VALUE;
        int x = 0;
        int y = 0;
        for (int i = 0; i < 9; i++) {
            int n = 0;
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                n = Integer.parseInt(st.nextToken());
                if (max < n) {
                    max = n;
                    x = i;
                    y = j;
                }
            }
        }
        System.out.print(max + "\n");
        System.out.print((x + 1) + " " + (y + 1));
    }
}
