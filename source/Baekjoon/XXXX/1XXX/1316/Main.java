import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int c = n;
        int[] l = new int[26];
        for (int i = 0; i < n; i++) {
            String s = br.readLine().toLowerCase();
            s = removeDuplicatedLetter(s);
            for (int j = 0; j < s.length(); j++) {
                l[s.charAt(j) - 'a']++;
            }
            for (int x : l) {
                if (x > 1) {
                    n--;
                    break;
                }
            }
            l = new int[26];
        }
        System.out.print(c);
    }
    static String removeDuplicatedLetter(String s) {
        StringBuilder sb = new StringBuilder();
        char p = 0;
        for (int i = 0; i < s.length(); i++) {
            char n = s.charAt(i);
            if (n != p) {
                sb.append(n);
                p = n;
            }
        }
        return sb.toString();
    }
}
