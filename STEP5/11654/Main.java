import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String c = br.readLine();
        System.out.print(c.getBytes(StandardCharsets.US_ASCII)[0] + "");
    }
}
