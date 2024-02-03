package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

public class Q1085 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int minLengthX = 0;
        int minLengthY = 0;

        minLengthX = x <= w - x ? x : w - x;
        minLengthY = y <= h - y ? y : h - y;

        int result = minLengthX <= minLengthY ? minLengthX : minLengthY;

        bw.write(result + "\n");
        br.close();
        bw.close();

    }
}
