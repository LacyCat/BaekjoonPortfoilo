import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine().toLowerCase();
        int[] a = new int[26];
        int max = Integer.MIN_VALUE;
        int m_c = 0;
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            a[s.charAt(i) - 97]++;
        }
        for (int i = 0; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
                m_c = i;
            }
        }
        for (int x : a) {
            if (x == max) c++;
        }
        if (c > 1) System.out.print("?");
        else System.out.print((char)(m_c + 65));
    }
}
