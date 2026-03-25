import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (st.hasMoreTokens()) {
            bw.write(String.valueOf(Double.parseDouble(st.nextToken()) / Double.parseDouble(st.nextToken())));
        }
        bw.flush();
    }
}