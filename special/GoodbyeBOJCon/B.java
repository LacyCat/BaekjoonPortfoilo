import java.io.*;
import java.util.*;

public class Main {
    //안녕... 백준 B
    //아니 이건뭐...
    // 해결한 문제 수 = n = 문제푼날 = 문제수 일때,
    // p_i (마감일?) - n = 안풀고 능력치쌓은날...
    // max써야하나??
    // 이미 같음 = 0
    // 다름:
    //  필요한 능력치 - 현재 능력치
    //  max(필요 - 현재, 0)
    //   이걸 셋에다가 모두 한 뒤 총합이 p_i - n을 넘기면 안됨!
    // 10^18 이 더 크니 long 써야겠네
    // 문제가 뒤로갈수록? 약속일이 미뤄지니
    // 그냥 순서 바꿀필요 없음!
    // 이게 어렵네...
    // 채점하고옴

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            long a = 0, b = 0, c = 0; // 현재 능력치들!
            long t_p_i = 0;
            boolean ok = true;
            for (int j = 0; j < n; j++) {
                st = new StringTokenizer(br.readLine());
                long a_i = Long.parseLong(st.nextToken()); //내지능보소 타입은 Long인데 Int를 pars하고있었던...
                long b_i = Long.parseLong(st.nextToken());
                long c_i = Long.parseLong(st.nextToken());
                long p_i = Long.parseLong(st.nextToken());
                if (!ok) continue;
                a += Math.max(a_i - a, 0);
                b += Math.max(b_i - b, 0);
                c += Math.max(c_i - c, 0);
                t_p_i = p_i - (j + 1);
                if (a + b + c > t_p_i) { ok = false; }
            }
            sb.append(ok ? "YES\n" : "NO\n"); // 삼항연산자 이걸까먹네 레전드ㅋㅋ;;
        }
        bw.append(sb);
        bw.flush();
        bw.close();
    }
}