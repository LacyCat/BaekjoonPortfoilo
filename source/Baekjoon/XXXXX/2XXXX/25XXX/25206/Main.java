import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        double t = 0;
        double s_t = 0;
        for (int i = 0; i < 20; i++) {
            st = new StringTokenizer(br.readLine());
            st.nextToken();
            double s = Double.parseDouble(st.nextToken());
            double a = 0;
            String l = st.nextToken();
            if (l.equals("P")) continue;
            a = switch (l) {
                case "A+" -> 4.5d;
                case "A0" -> 4.0d;
                case "B+" -> 3.5d;
                case "B0" -> 3.0d;
                case "C+" -> 2.5d;
                case "C0" -> 2.0d;
                case "D+" -> 1.5d;
                case "D0" -> 1.0d;
                case "F" -> 0.0d;
                default -> a;
            };
            t += s;
            s_t += s * a;
        }
        System.out.print(s_t / t);
    }
}
