import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }
        a = heapsort(a);
        Arrays.stream(a).forEach(v -> System.out.print(v + "\n"));
    }
    static int[] heapsort(int[] a) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for (int v : a) {
            q.add(v);
        }
        int[] n = new int[a.length];
        for (int i = 0; i < n.length; i++) {
            n[i] = q.isEmpty() ? 0 : q.poll();
        }
        return n;
    }
}