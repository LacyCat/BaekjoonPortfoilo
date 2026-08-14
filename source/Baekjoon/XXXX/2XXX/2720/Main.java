import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int c = Integer.parseInt(br.readLine());
        for (int i = 0; i < c; i++) {
            int C = Integer.parseInt(br.readLine());
            int t = 0;
            for (int j = 0; j < 4; j++) {
                if (j != 3) {
                    t = C / get(j);

                }
                else {
                    t = C % get(j);
                }
                C = C % get(j);
                sb.append(t + " ");
            }
        }
        System.out.print(sb);
    }
    static int get(int v) {
        return switch (v) {
            case 0 -> 25;
            case 1 -> 10;
            case 2, 3 -> 5;
            default -> 0;
        };
    }
}
