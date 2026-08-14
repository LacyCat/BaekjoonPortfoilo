import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] a = new int[100];
        Arrays.sort(a);
        System.out.print(Arrays.stream(heapsort(getDigits(br.readLine()))).mapToObj(String::valueOf).collect(Collectors.joining("")));
    }
    static int[] heapsort(int[] a) {
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        for (int v : a) {
            q.add(v);
        }
        int[] n = new int[a.length];
        for (int i = 0; i < n.length; i++) {
            n[i] = q.isEmpty() ? 0 : q.poll();
        }
        return n;
    }
    static int[] getDigits(String s) {
        int[] digits = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            digits[i] = s.charAt(i) - '0';
        }
        return digits;
    }
}