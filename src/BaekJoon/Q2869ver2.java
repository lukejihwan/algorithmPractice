package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

public class Q2869ver2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int climb = Integer.parseInt(st.nextToken());
        int fall = Integer.parseInt(st.nextToken());
        int goal = Integer.parseInt(st.nextToken());


        int result = (goal - climb) /(climb-fall);
        if((goal - climb) % (climb - fall) != 0) result++;

        bw.write((result+1) + "\n");
        br.close();
        bw.close();

    }
}
