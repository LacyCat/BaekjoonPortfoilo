import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        char[][] a = new char[5][15];
        for (int i = 0; i < 5; i++) {
            Arrays.fill(a[i],' ');
        }
        for (int i = 0; i < 5; i++) {
            String s = br.readLine();
            for (int j = 0; j < s.length(); j++) {
                a[i][j] = s.charAt(j);
            }
        }
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if (a[j][i] != ' ') {
                    sb.append(a[j][i]);
                }
            }
        }
        System.out.print(sb);
    }
}
