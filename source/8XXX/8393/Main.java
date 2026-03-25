import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int r = 0;
        for (int i = 1; i -1 < n; i++) {
            r += i;
        }
        System.out.print(r);
    }
}
