package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

public class Q2745 {
    public static void main(String[] args) throws IOException {
        //N과 B진법을 저장한다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        String N = st.nextToken();
        int B = Integer.parseInt(st.nextToken());

        //Integer.parseInta 함수를 사용하여 변환한다.
        int result = Integer.parseInt(N, B);

        //변환한 값을 출력한다.
        bw.write(result + "\n");
        br.close();
        bw.close();

    }
}
