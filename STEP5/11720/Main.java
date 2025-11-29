import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int c = Integer.parseInt(br.readLine());
        int t = 0;
        String s = br.readLine();
        for (int i = 0; i < s.length(); i++) {
            t += Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        System.out.print(t);
    }
}
