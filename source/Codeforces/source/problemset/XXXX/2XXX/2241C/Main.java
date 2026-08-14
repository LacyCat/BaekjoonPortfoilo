import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            char[] str = new char[Integer.parseInt(br.readLine())];
            str = br.readLine().toCharArray();
            int c = work(str);
            switch (c) {
                case 1: { sb.append("2\n"); break; }
                default: sb.append("1\n");
            }
        }
        System.out.print(sb);
    }
    static int work(char[] arr) {
        int changes = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) changes++;
        }
        return changes;
    }
}