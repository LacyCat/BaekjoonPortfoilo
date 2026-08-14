package org.example;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int[] a = new int[3];
        while (true) {
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < 3; i++) {
                a[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(a);
            if (Arrays.stream(a).sum() == 0) break;
            if (a[0] + a[1] <= a[2]) {
                System.out.print("Invalid\n");
            }
            else if (Arrays.stream(a).allMatch(v -> v == a[1])) {
                System.out.print("Equilateral\n");
            }
            else if (a[0] == a[1] || a[1] == a[2] || a[2] == a[0]) {
                System.out.print("Isosceles\n");
            }
            else {
                System.out.print("Scalene\n");
            }
        }
    }
}