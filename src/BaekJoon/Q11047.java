package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

public class Q11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //1. N과 K를 변수에 담는다.

        //2. N만큼의 배열을 생성하고, 배열에 담는다.

        //3. 배열의 가장 끝부터 K와 비교하여 K보다 작을 때 세기 시작한다.

        //4. K보다 작을 때 마다 K를 빼서 안 빼지면, 그 다음 수로 이동해서 빼고,

        //5. 안빼지면, 그 다음 수로 넘어가면서 K가 0이 될 때까지 반복한다.

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] array = new int[N];

        for(int i = 0; i < N; i++){
            array[i] = Integer.parseInt(br.readLine());
        }

        int count = 0;
        for(int i = N - 1; i >= 0; i--){
            int rest = K - array[i];
            if(rest >= 0){
                int quotient = K / array[i];
                count += quotient;
                K = K - array[i] * quotient;
            }

            if(K == 0) break;

        }

        bw.write(count + "\n");
        br.close();
        bw.close();

    }
}
