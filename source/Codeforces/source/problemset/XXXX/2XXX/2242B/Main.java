import java.io.*;
import java.util.*;

// 2242-B 번 문제
// Predominant Frequency Division
public class Main {

    /*
     * 1, 2, 3으로만 이루어진 배열 a가 주어짐.
     * a가 비어있지 않는 연속적인 배열 조각 3개로 쪼갤 수 있는지 체크
     * 조각 규칙:
     * 1번 조각 배열은 1이 절반 이상을 차지해야함
     * 2번 조각 배열은 1과 2의 개수의 합이 3보다 많아야함
     * 3번 조각 배열은 그냥 비어있지만 않으면 됨
     * 입력:
     *  첫번째 줄에 테스트케이스 개수가 들어옴.
     *  짝수번째 줄에는 배열의 길이가 주어짐.
     *  (i+2)번째 줄에는 배열 a가 주어짐. (i % 2 != 0)
     * 출력:
     *  각 배열이 쪼개질 수 있는지 출력함.
     *  YES나 YeS, NO나 nO나 상관 없음.
     *
     * 배열의 길이는 3<=n<=2*10^5
     */
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int len = Integer.parseInt(br.readLine());
            int[] a = new int[len];
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < len; j++) {
                a[j] = Integer.parseInt(st.nextToken());
            }
            boolean success = false;

            int[] cnt1 = work(a,len,1);
            int[] cnt2 = work(a,len,3);

            /*
             * 세번째 조각은 최소 1의 길이를 가짐.
             * 두번째 조각은 최소 1의 길이를 가짐.
             * 첫번째 조각의 최대 길이는 결국 len - 3임
             */
            for (int j = 0; j <= len - 3; j++) {
                if (cnt1[j+1] >= j + 1 - cnt1[j+1]) {
                    for (int k = j + 1; k <= len - 2; k++) {
                        if ((cnt2[k + 1] - cnt2[j + 1]) <= k - j - (cnt2[k + 1] - cnt2[j + 1])) {
                            sb.append("YES\n");
                            success = true;
                            break;
                        }
                    }
                    if (success) break;
                }
            }
            if (!success) sb.append("NO\n");
        }
        bw.append(sb);
        bw.flush();
        bw.close();
    }
    static int[] work(int[] arr, int len, int target) {
        /*
        int[] ret = new int[3];
        for (int i : arr) {
            ret[i - 1]++;
        }
        return ret;
         */
        // 강화 버전: 접두합 사용
        int[] ret = new int[len + 1];
        for (int i = 0; i < len; i++) {
            ret[i + 1] = ret[i] + (arr[i] == target ? 1 : 0);
        }
        return ret;
    }
}