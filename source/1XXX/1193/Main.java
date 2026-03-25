import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int x, y;
        int l = 1;
        while (l * (l + 1) / 2 < n) l++;
        int p = n - (l - 1) * l / 2;
        if (l % 2 == 1) {
            x = l - p + 1;
            y = p;
        } else {
            x = p;
            y = l - p + 1;
        }
        System.out.print(x + "/" + y);
    }
}
