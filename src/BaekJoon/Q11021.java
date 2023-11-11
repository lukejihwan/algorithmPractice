package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

public class Q11021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int repetitionNum = Integer.parseInt(br.readLine());
        for (int i = 1; i <= repetitionNum; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int resultNum = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
            bw.write("Case #" + i + ": " + resultNum + "\n");
        }
        br.close();
        bw.close();
    }
}
