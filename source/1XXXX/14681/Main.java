import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());
        int a = 0;
        if (x > 0) {
            if (y > 0) a = 1;
            else a  = 4;
        }
        else {
            if (y > 0) a = 2;
            else a = 3;
        }
        System.out.print(a);
    }
}
