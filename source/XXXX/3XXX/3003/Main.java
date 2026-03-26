import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < 6; i++) {
            int n = Integer.parseInt(st.nextToken());
            switch (i) {
                case 0: sb.append(1 - n + " "); break;
                case 1: sb.append(1 - n + " "); break;
                case 2: sb.append(2 - n + " "); break;
                case 3: sb.append(2 - n + " "); break;
                case 4: sb.append(2 - n + " "); break;
                case 5: sb.append(8 - n ); break;
            }
        }
        System.out.print(sb);
    }
}
