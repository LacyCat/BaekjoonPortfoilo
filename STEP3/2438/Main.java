import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int c = Integer.parseInt(br.readLine());
        for (int i = 1; i - 1 < c; i++) {
            sb.append("*".repeat(i)).append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
    }
}
