package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

public class Q1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int answer = 0;

        for(int i = 0; i < count; i++){
            int result = 0;
            int N = Integer.parseInt(st.nextToken());
            if(N == 1) continue;

            for(int j = 1; j < N; j++){
                if(N % j == 0 && j != 1){
                    result++;
                }
            }

            if(result == 0) answer++;

        }

        bw.write(answer + "\n");
        br.close();
        bw.close();

    }
}
