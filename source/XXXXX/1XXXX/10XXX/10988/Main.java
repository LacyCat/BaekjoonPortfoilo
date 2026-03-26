import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String s = br.readLine();
        if (sb.append(s).reverse().toString().equals(s)) System.out.print("1");
        else System.out.print("0");
    }
}
