import java.io.*;
import java.util.*;

public class Main { // 이게맞네 무식하게 정사각형부터 해보려고했는데
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            sb.append("*".repeat(n)).append("\n");
        }
        System.out.print(sb);
    }
}