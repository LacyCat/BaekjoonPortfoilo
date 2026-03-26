import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        for (int i = 2; i * i <= n ; i++) {
            while (n % i == 0) {
                System.out.print(i + "\n");
                n /= i;
            }
        }
        if (n > 1) {
            System.out.print(n);
        }
    }
}
