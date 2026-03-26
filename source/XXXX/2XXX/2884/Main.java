import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            int h = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            m -= 45;  // 45분 빼기

            if (m < 0) {      // 분이 음수면
                m += 60;      // 60을 더하고
                h--;          // 시간 1 감소

                if (h < 0) {  // 시간이 음수면
                    h = 23;   // 23시로
                }
            }

            System.out.print(h + " " + m);
        }
    }
}