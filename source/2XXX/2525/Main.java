import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(br.readLine());
        m += c;
        while (m >= 60) {    // 60분 이상이면 반복
            h++;
            m -= 60;
        }
        while (h >= 24) {    // 24시 이상이면 반복
            h -= 24;
        }
        System.out.print(h + " " + m);
    }
}