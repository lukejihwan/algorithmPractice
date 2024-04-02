package BaekJoon;

import java.io.*;
import java.util.Arrays;

public class Q11651 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        int[][] arr = new int[N][2];

        for(int i = 0; i < N; i++) {
            arr[i][1] = Integer.parseInt(br.readLine());
            arr[i][0] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr, (e1, e2) -> {
            if(e1[0] == e2[0]) {
                return e1[1] - e2[1];
            } else {
                return e1[0] - e2[0];
            }
        });

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++) {
            sb.append(arr[i][1] + " " + arr[i][0]).append('\n');
        }

        bw.write(sb.toString() + "\n");
        br.close();
        bw.close();

    }
}
