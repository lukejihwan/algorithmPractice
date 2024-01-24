package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

public class Q2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int climb = Integer.parseInt(st.nextToken());
        int fall = Integer.parseInt(st.nextToken());
        int goal = Integer.parseInt(st.nextToken());

        int snail = 0;
        int days = 0;

        while(snail < goal){
            days++;
            snail = snail + climb;
            if(snail >= goal) break;
            snail = snail - fall;
        }

        bw.write(days + "\n");
        br.close();
        bw.close();

    }
}
