import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long p = Integer.parseInt(st.nextToken());
        long v = Integer.parseInt(st.nextToken());
        long k = Integer.parseInt(st.nextToken());

        long g = lcm(p+1,v+1);
        long[] a = new long[4];
        a[1] = k / g;
        a[2] = k / (v + 1) - a[1];
        a[3] = k / (p + 1) - a[1];
        a[0] = k - (a[2] + a[3] + a[1]);
        System.out.print(Arrays.stream(a).mapToObj(String::valueOf).collect(Collectors.joining(" ")));
    }
    private static long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }
    private static long lcm(long a, long b) {
        return (a*b)/gcd(a,b);
    }
}