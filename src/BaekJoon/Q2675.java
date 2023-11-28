package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

public class Q2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int repetition = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < repetition; i++){
            st = new StringTokenizer(br.readLine());
            int firstNum = Integer.parseInt(st.nextToken());
            String str = st.nextToken();
            for(int j = 0; j < str.length(); j++){
                String ch = str.substring(j, j + 1);
                sb.append(ch.repeat(firstNum));
            }
            sb.append("\n");
        }
        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}
