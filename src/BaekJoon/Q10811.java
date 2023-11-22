package BaekJoon;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Q10811 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[Integer.parseInt(st.nextToken())];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        int N = Integer.parseInt(st.nextToken());
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int order1 = Integer.parseInt(st.nextToken()) - 1;
            int order2 = Integer.parseInt(st.nextToken()) - 1;

            while (order1 < order2) {
                int temp = arr[order1];
                arr[order1++] = arr[order2];
                arr[order2--] = temp;
            }

        }
        String ret = "";
        for (int j = 0; j < arr.length; j++) {
            ret += arr[j] + " ";
        }
        bw.write(ret.trim());
        br.close();
        bw.close();
    }
}
