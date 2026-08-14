import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int c = Integer.parseInt(br.readLine());
        for (int i = 0; i < c; i++) {
            String t = br.readLine();
            sb.append(t.charAt(0));
            if (t.length() == 1) {
                sb.append(t.charAt(0));
            }
            else {
                sb.append(t.charAt(t.length() - 1));
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
