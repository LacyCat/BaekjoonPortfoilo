import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[] a = new int[n];
        Map<Integer, Integer> m = new HashMap<>();
        int x = 0;
        int[] a_2;
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        a_2 = a.clone();
        Arrays.sort(a_2);
        for (int i = 0; i < n; i++) {
            if (!m.containsKey(a_2[i])) {
                m.put(a_2[i], x++);
            }
        }
        Arrays.stream(a).forEach(v -> sb.append(m.get(v)).append(" "));
        bw.append(sb);
        bw.flush();
        bw.close();
    }
}