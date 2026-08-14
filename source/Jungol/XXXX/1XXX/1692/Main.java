import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int len = (n == 0) ? 1 : (int) Math.log10(n) + 1;

        for (int i = 1; i <= len; i++) {
            sb.append(n * getDigitAt(m, len - i) + "\n");
        }
        sb.append(n*m);
        System.out.print(sb);
    }
    public static int getDigitAt(int n, int index) {
        int len = (n == 0) ? 1 : (int) Math.log10(n) + 1;
        return (int) (n / Math.pow(10, len - 1 - index)) % 10;
    }
}