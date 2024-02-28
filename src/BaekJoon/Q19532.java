package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

public class Q19532 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int f = Integer.parseInt(st.nextToken());

        //두개의 연립 방정식을 모두 더한다.

        //x에 -999 부터 999까지 대입하면서 y가 정수로 출력되는 경우

        //x와 y를 출력한다.
        int answerX = 0;
        int answerY = 0;
        for(int i = -999; i < 1000; i++){
            for(int j = -999; j < 1000; j++){
                if((a * i + b * j == c) && (d * i + e * j == f)){
                    answerX = i;
                    answerY = j;
                    bw.write(answerX + " " + answerY + "\n");
                    break;
                }
            }
        }

        br.close();
        bw.close();
    }
}
