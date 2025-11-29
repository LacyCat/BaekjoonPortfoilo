import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        String b = br.readLine();
        StringBuilder sb = new StringBuilder();
        for (int i = b.length()-1; i >= 0; i--) {
            int bi = b.charAt(i) - '0';
            sb.append(a * bi).append("\n");
        }
        sb.append(a * Integer.parseInt(b));
        System.out.print(sb);
    }
}
