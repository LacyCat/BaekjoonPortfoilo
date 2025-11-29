import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int b = Integer.parseInt(br.readLine());
        for (int i = 0; i < b/4; i++) {
            sb.append("long ");
        }
        sb.append("int");
        System.out.print(sb);
    }
}
