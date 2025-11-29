import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int ia = Integer.parseInt(br.readLine());
        for (int ib = 1; ib < 10; ib++) {
            sb.append(ia + " * " + ib + " = " + ia * ib).append("\n");
        }
        System.out.print(sb);
    }
}
