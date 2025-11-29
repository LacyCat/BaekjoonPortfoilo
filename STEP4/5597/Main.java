import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = 0;
        int y = 0;
        boolean a[] = new boolean[30];
        for (int i = 0; i < 28; i++) {
            a[Integer.parseInt(br.readLine()) - 1] = true;
        }
        for (int i = 0; i < a.length; i++) {
            if (!a[i]) {
                if (x == 0) x = i;
                else if (y == 0) y = i;
            }
        }
        System.out.print((Math.min(x,y) + 1) + "\n" + (Math.max(x,y) + 1));
    }
}
