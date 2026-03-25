import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String S = br.readLine();
        for (int j = 97; j < 123; j++) {
            sb.append(S.indexOf(j) + " ");
        }
        sb.deleteCharAt(sb.length() - 1);
        System.out.print(sb);
    }
}
