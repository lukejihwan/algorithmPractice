package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

public class Q11022 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int repetitionNum = Integer.parseInt(br.readLine());
        for (int i = 1; i <= repetitionNum; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int firstNum = Integer.parseInt(st.nextToken());
            int secondNum = Integer.parseInt(st.nextToken());
            int answer = firstNum + secondNum;
            bw.write("Case #" + i + ": " + firstNum + " + " + secondNum + " = " + answer + "\n");
        }
        br.close();
        bw.close();
    }
}
