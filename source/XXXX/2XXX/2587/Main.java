import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] a = new int[5];
        for (int i = 0; i < 5; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(a);
        System.out.print(Arrays.stream(a).sum() / a.length + "\n");
        System.out.print(a[2]);
    }
}