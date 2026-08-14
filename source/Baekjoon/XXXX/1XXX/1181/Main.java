import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] a = new String[n];
        for (int i = 0; i < n; i++) {
            a[i] = br.readLine();
        }
        Arrays.sort(a,(x,y) -> {
            if (x.length() == y.length()) {
                return x.compareTo(y);
            }
            return x.length() - y.length();
        });
        a = (String[]) Arrays.stream(a).distinct().toArray(String[]::new);
        Arrays.stream(a).forEach(System.out::println);
    }
}