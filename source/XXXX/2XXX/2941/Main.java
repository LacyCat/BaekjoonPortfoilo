import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        s = s.replace("c=", "C");   // 2글자 → 1글자
        s = s.replace("c-", "C");
        s = s.replace("dz=", "D");  // 3글자 → 1글자
        s = s.replace("d-", "D");
        s = s.replace("lj", "L");
        s = s.replace("nj", "N");
        s = s.replace("s=", "S");
        s = s.replace("z=", "Z");
        System.out.print(s.length());
    }
}
