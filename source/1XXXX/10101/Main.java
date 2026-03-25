import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] a = new int[3];
        for (int i = 0; i < 3; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }
        if (Arrays.stream(a).sum() != 180) {
            System.out.print("Error");
        } else if (a[0] == a[1] && a[1] == a[2]) {
            System.out.print("Equilateral");
        } else if (a[0] != a[1] && a[1] != a[2] && a[0] != a[2]) {
            System.out.print("Scalene");
        } else {
            System.out.print("Isosceles");
        }

    }
}
