import java.io.*;
import java.util.*;

// PLEASE CODEFORCE PLEASE LET ME OUT
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        // 먼저 n - 1 = k 일때는 무조건 -1 이다.
        // 같은 인접한 숫자를 묶어서 m개의 조각으로 쪼갰을 때, m이 짝수면 0과 1의 조각 개수가 각각 m/2, 끝 조각은 무조건 시작하는 조각
        // 각 조각의 길이 l 이 있을 때, k는 (l_i - 1)m이다.
        // k = Σl_i - m 인데, Σl_i = n 이다. 결국 k = n - m 인 것이다. 여기에서 우리는 k와 n이 주어지므로 m 을 구할 수 있다. (m = n - k)
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            int m = n - k;

            // 씁 이거 어떻게해야하지
            // 지금 구해야할 게 각 m의 길이 l인데...
            // 음 n - (floor(n/m) * m) 만큼을 1번 조각에 floor(n/m) 개 씩 주면 된다
            // 주의: 짝수면 1 조각에 floor 더하고, 0 조각에 ceil 더하기
            if (k == n - 1) {
                sb.append("-1\n");
                continue;
            }

            // 싹다 고치는 중...
            // 으악 날제발여기서꺼내줘살려달란말이야더이상할기분이아닌데이문제까지는끝내야할거아니야아니무슨테스트1212122이렇게틀리는건뭐농락하는것도아니고제발맞다고라도해줘...
            int a = (m + 1) / 2;
            int b = m / 2;
            int c = a - b;
            int d = k;

            int e_z = (d - c + 1) / 2;
            int e_o = d - e_z;

            int[] s = new int[m];
            Arrays.fill(s, 1);
            s[0] += e_z;
            s[1] += e_o;

            sb.append(format(s) + "\n");
        }
        bw.append(sb);
        bw.flush();
        bw.close();
    }
    private static String format(int[] a) {
        char[] s = new char[Arrays.stream(a).sum()];
        int c = 0;
        char f = '0';
        for (int v : a) {
            int end = c + v;
            while (c < end) s[c++] = f;
            f ^= 1;
        }
        return new String(s);
    }
}