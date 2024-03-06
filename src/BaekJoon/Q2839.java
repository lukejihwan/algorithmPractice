package BaekJoon;

import java.io.*;

public class Q2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //1. 수가 주어지면 먼저 5로 나눈다음, 3으로 나눈다.

        //2. 3으로 나누어 지지 않으면 5를 하나씩 줄여가며 맞아 떨어질 때까지 반복한다.

        //3. 5를 다 줄여서 3으로 나눌 때 나누어 떨어지지 않으면 -1을 출력한다.

        int N = Integer.parseInt(br.readLine());

        int kg3 = 3;
        int kg5 = 5;

        int kg5Ea = N / kg5; // 18 / 5 = 3
        int kg3Ea = 0;

        for(int i = kg5Ea; i >= 0; i--){
            int rest = N - kg5 * i;

            if (rest == 0) {
                bw.write(i + "\n");
                break;
            }else if(rest % kg3 == 0){
                kg3Ea = rest / kg3;
                bw.write(i + kg3Ea + "\n");
                break;
            }

            if(i == 0) bw.write(-1 + "\n");

        }

        br.close();
        bw.close();

    }
}
