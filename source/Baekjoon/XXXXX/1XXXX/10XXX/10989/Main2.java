import java.io.*;
import java.util.*;

public class Main {
    // 일반 내장 함수는 하남자같아서 카운팅소트버전으로 재업
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }
        int m = Arrays.stream(a).max().getAsInt();
        int[] c_a = new int[m+1];
        int[] r = new int[a.length];
        Arrays.stream(a).forEach(value -> c_a[value]++);
        Arrays.parallelPrefix(c_a,Integer::sum);
        for (int i = a.length - 1; i >= 0; i--) {
            int v = a[i];
            int p = c_a[v] - 1;
            r[p] = v;
            c_a[v]--;
        }
        Arrays.stream(r).forEach(v -> sb.append(v).append("\n"));
        bw.append(sb);
        bw.flush();
        bw.close();
    }
}