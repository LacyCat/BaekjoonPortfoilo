import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> a = new ArrayList<>();
        int r = 0;
        for (int i = 0; i < 10; i++) {
            int n = Integer.parseInt(br.readLine());
            if (!a.contains(n % 42)) a.add(n % 42);
        }
        for (int i = 0; i < (long) a.size(); i++) {
            r++;
        }
        System.out.print(r);
    }
}
