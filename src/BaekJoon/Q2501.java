package BaekJoon;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q2501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            // 6이하의 수 중에 약수인 것들을 찾는다.
            String[] str = br.readLine().split(" ");
            int N = Integer.parseInt(str[0]);
            int K = Integer.parseInt(str[1]);
            ArrayList<Integer> arrayList = new ArrayList();

            for (int i = 1; i <= N; i++) {
                int rest = N % i;
                if (rest == 0) arrayList.add(i);
            }

            // 6이하의 수 들에서 K번째로 작은 수를 출력한다
            int result = arrayList.get(K - 1);
            bw.write(result + "\n");
        }catch (IndexOutOfBoundsException exception){
            bw.write(0 + "\n");
        }
        br.close();
        bw.close();

    }
}
