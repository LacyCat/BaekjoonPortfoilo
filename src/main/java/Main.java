import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int[] s = new int[3];
        while (s[0] != 0 & s[1] != 0 && s[2] != 3) {
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < 3; i++) {
                s[i] = Integer.parseInt(st.nextToken());
            }
            if (!isValidTriangle(s)) {
                sb.append("Invalid");
                continue;
            }
        }
    }
    private static boolean isValidTriangle(int[] s) {
        Arrays.sort(s);
        int t = 0;
        for (int i = 0; i < 2; i++) {
            t += s[i];
        }
        if (t < s[2]) return false;
        else return true;
    }
}
