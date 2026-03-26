import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (st.hasMoreTokens()) {
            bw.write(String.valueOf(Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken())));
        }
        bw.flush();
    }
}