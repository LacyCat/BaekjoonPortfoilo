import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int c = 0;
        int m = 666;
        while (true) {
            if (String.valueOf(m).contains("666")) {
                c++;
            }
            if (c == n) {
                System.out.print(m);
                break;
            }
            m++;
        }
    }
}